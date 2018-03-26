package cf.techfusion.yasin.youtubecopy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class YoutubeVideoAdapter extends RecyclerView.Adapter<YoutubeVideoAdapter.VideoHolder>{


    @Override
    public VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.video_layout;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        VideoHolder viewHolder = new VideoHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VideoHolder holder, int position) {}

    @Override
    public int getItemCount() {
        return 30;
    }

    public class VideoHolder extends RecyclerView.ViewHolder {
        public VideoHolder(View itemView) {
            super(itemView);
        }
    }
}
