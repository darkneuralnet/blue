package zendesk.support.requestlist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;
import zendesk.support.requestlist.RequestListView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RequestListViewHolder extends RecyclerView.AbstractC11834D {
    private final int avatarRadius;
    private final ZendeskAvatarView avatarView;
    private final TextView commentText;
    private final Context context;
    private final RequestListView.OnItemClick listener;
    private final C42732iT3 picasso;
    private final TextView subjectText;
    private final TextView timeText;
    private final TextView userText;

    private RequestListViewHolder(View view, RequestListView.OnItemClick onItemClick, C42732iT3 c42732iT3) {
        super(view);
        this.listener = onItemClick;
        this.picasso = c42732iT3;
        Context context = view.getContext();
        this.context = context;
        this.avatarView = (ZendeskAvatarView) view.findViewById(C35181Pg4.request_list_item_avatar);
        this.timeText = (TextView) view.findViewById(C35181Pg4.request_list_item_time);
        this.userText = (TextView) view.findViewById(C35181Pg4.request_list_item_user);
        this.subjectText = (TextView) view.findViewById(C35181Pg4.request_list_item_subject);
        this.commentText = (TextView) view.findViewById(C35181Pg4.request_list_item_body);
        this.avatarRadius = context.getResources().getDimensionPixelOffset(C35640Rf4.zs_request_list_avatar_radius);
    }

    private void bindAvatar(boolean z, List<String> list, String str) {
        if (z) {
            if (C44504lS5.m27273b(str)) {
                this.avatarView.showUserWithAvatarImage(this.picasso, str, list.get(0), this.avatarRadius);
                return;
            } else {
                this.avatarView.showUserWithName(list.get(0));
                return;
            }
        }
        this.avatarView.showUserWithIdentifier(Integer.valueOf(C41720gl4.request_list_me));
    }

    public static RequestListViewHolder create(Context context, ViewGroup viewGroup, RequestListView.OnItemClick onItemClick, C42732iT3 c42732iT3) {
        return new RequestListViewHolder(LayoutInflater.from(context).inflate(C52975zk4.zs_request_list_ticket_item, viewGroup, false), onItemClick, c42732iT3);
    }

    private String generateUserText(String str, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        return TextUtils.join(", ", arrayList);
    }

    private CharSequence getDateTimeString(Date date) {
        return DateUtils.getRelativeTimeSpanString(this.context, date.getTime(), false);
    }

    private void style(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(1));
            this.userText.setTypeface(Typeface.defaultFromStyle(1));
            this.commentText.setTextColor(NA0.m94301c(this.context, C52925zf4.zs_request_list_dark_text_color));
            this.timeText.setTextColor(UiUtils.themeAttributeToColor(C44032kf4.colorPrimary, this.context, C52925zf4.zs_request_list_light_text_color));
        } else {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(0));
            this.userText.setTypeface(Typeface.defaultFromStyle(0));
            TextView textView = this.commentText;
            Context context = this.context;
            int i = C52925zf4.zs_request_list_light_text_color;
            textView.setTextColor(NA0.m94301c(context, i));
            this.timeText.setTextColor(NA0.m94301c(this.context, i));
        }
        if (z2) {
            this.commentText.setTextColor(NA0.m94301c(this.context, C52925zf4.zs_request_cell_label_color_error));
        }
        this.itemView.setBackgroundColor(NA0.m94301c(this.context, C52925zf4.zs_request_list_white));
    }

    public void bind(final RequestListItem requestListItem) {
        String firstMessage;
        CharSequence charSequence;
        this.userText.setText(generateUserText(this.context.getString(C41720gl4.request_list_me), requestListItem.getLastCommentingAgentNames()));
        TextView textView = this.subjectText;
        if (requestListItem.hasAgentReplied()) {
            firstMessage = this.context.getString(C41720gl4.request_list_re, requestListItem.getFirstMessage());
        } else {
            firstMessage = requestListItem.getFirstMessage();
        }
        textView.setText(firstMessage);
        if (requestListItem.isClosed()) {
            this.commentText.setText(C41720gl4.request_list_ticket_closed);
        } else if (requestListItem.isFailed()) {
            this.commentText.setText(C41720gl4.ask_request_list_failed_request_message);
        } else {
            this.commentText.setText(requestListItem.getLastMessage());
        }
        Date lastUpdated = requestListItem.getLastUpdated();
        TextView textView2 = this.timeText;
        if (lastUpdated != null) {
            charSequence = getDateTimeString(lastUpdated);
        } else {
            charSequence = "";
        }
        textView2.setText(charSequence);
        bindAvatar(requestListItem.hasAgentReplied(), requestListItem.getLastCommentingAgentNames(), requestListItem.getAvatar());
        style(requestListItem.isUnread(), requestListItem.isFailed(), requestListItem.isClosed());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListViewHolder.this.listener.onClick(requestListItem);
            }
        });
    }
}
