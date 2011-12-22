package com.robotoer.redditreader;

import java.util.ArrayList;
import java.util.List;

import com.robotoer.jreddit.*;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopicsFragment extends ListFragment {
	protected FrontPage fp;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		// Shouldn't do this in the future, need to handle loading from savedInstances
		fp = new FrontPage();
		List<Topic> topics = fp.getTopics();
		List<String> topicNames = new ArrayList<String>();
		
		for(Topic t : topics)
			topicNames.add(t.getTitle());
		
		setListAdapter(new ArrayAdapter<String>(getActivity(), R.layout.main, topicNames));
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
	}
}
