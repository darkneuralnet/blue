package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;
/* loaded from: classes8.dex */
class ViewToolbarAvatar extends FrameLayout {
    private static final int[] IMAGE_VIEW_IDS = {C35181Pg4.zs_request_toolbar_avatar_1, C35181Pg4.zs_request_toolbar_avatar_2, C35181Pg4.zs_request_toolbar_avatar_3, C35181Pg4.zs_request_toolbar_avatar_4, C35181Pg4.zs_request_toolbar_avatar_5};
    static final int MAX_IMAGES = 5;
    private final List<ZendeskAvatarView> avatarViews;
    private int imageRadius;
    private int strokeColor;
    private int strokeWidth;
    private List<C48526sE3<String, String>> userInfo;

    public ViewToolbarAvatar(Context context) {
        this(context, null);
    }

    private void bindData(C42732iT3 c42732iT3) {
        for (int i = 0; i < this.avatarViews.size(); i++) {
            ZendeskAvatarView zendeskAvatarView = this.avatarViews.get(i);
            if (i < this.userInfo.size()) {
                C48526sE3<String, String> c48526sE3 = this.userInfo.get(i);
                if (C44504lS5.m27273b(c48526sE3.f108491a)) {
                    zendeskAvatarView.showUserWithAvatarImage(c42732iT3, c48526sE3.f108491a, c48526sE3.f108492b, this.imageRadius);
                } else {
                    zendeskAvatarView.showUserWithName(c48526sE3.f108492b);
                }
                zendeskAvatarView.setVisibility(0);
            } else {
                zendeskAvatarView.setVisibility(8);
            }
        }
    }

    private ZendeskAvatarView createAndAddView(int i) {
        ZendeskAvatarView zendeskAvatarView = new ZendeskAvatarView(getContext());
        zendeskAvatarView.setId(IMAGE_VIEW_IDS[i]);
        zendeskAvatarView.setStroke(this.strokeColor, this.strokeWidth);
        int i2 = this.imageRadius * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 8388613;
        layoutParams.setMarginEnd(i * 2 * (i2 / 3));
        addView(zendeskAvatarView, layoutParams);
        return zendeskAvatarView;
    }

    public void setImageUrls(C42732iT3 c42732iT3, List<C48526sE3<String, String>> list) {
        if (list.size() > 5) {
            this.userInfo = list.subList(0, 5);
        } else {
            this.userInfo = C43505jm0.m29954c(list);
        }
        Collections.reverse(this.userInfo);
        bindData(c42732iT3);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.avatarViews = new ArrayList(5);
        this.userInfo = new ArrayList(5);
        this.imageRadius = context.getResources().getDimensionPixelOffset(C35640Rf4.zs_request_toolbar_avatar_radius);
        this.strokeWidth = context.getResources().getDimensionPixelOffset(C35640Rf4.zs_request_toolbar_avatar_stroke_width);
        this.strokeColor = UiUtils.themeAttributeToColor(C44032kf4.colorPrimary, getContext(), C52925zf4.zs_request_fallback_color_primary);
        for (int i2 = 0; i2 < 5; i2++) {
            ZendeskAvatarView createAndAddView = createAndAddView(i2);
            createAndAddView.setVisibility(8);
            this.avatarViews.add(createAndAddView);
        }
    }
}
