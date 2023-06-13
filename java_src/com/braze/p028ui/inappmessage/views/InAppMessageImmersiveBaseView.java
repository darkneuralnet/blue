package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.appboy.p027ui.R$dimen;
import com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView;
import java.util.List;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView */
/* loaded from: classes5.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements BO1 {
    private static final String TAG = C43664k20.m29433n(InAppMessageImmersiveBaseView.class);

    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLargerCloseButtonClickArea$1(View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) view.getParent()).setTouchDelegate(new TouchDelegate(rect, view));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isInTouchMode() && keyEvent.getKeyCode() == 4 && C42478i20.m35358s().m6655e()) {
            DZ1.m110187a();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && C42478i20.m35358s().m6655e()) {
            DZ1.m110187a();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        if (C43318jS5.m30597g(getMessageTextView().getText().toString())) {
            C36938Wt6.m77734j(getMessageTextView());
        }
        if (C43318jS5.m30597g(getMessageHeaderTextView().getText().toString())) {
            C36938Wt6.m77734j(getMessageHeaderTextView());
        }
        DZ1.m110186b(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(Integer num) {
        DZ1.m110183e(getFrameView(), num);
    }

    public void setLargerCloseButtonClickArea(final View view) {
        if (view != null && view.getParent() != null) {
            if (view.getParent() instanceof View) {
                ((View) view.getParent()).post(new Runnable() { // from class: uZ1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InAppMessageImmersiveBaseView.this.lambda$setLargerCloseButtonClickArea$1(view);
                    }
                });
                return;
            }
            return;
        }
        C43664k20.m29421z(TAG, "Cannot increase click area for view if view and/or parent are null.");
    }

    public void setMessageButtons(List<C45103mT2> list) {
        C42784iZ1.m33806d(getMessageButtonViews(list.size()), list);
    }

    public void setMessageCloseButtonColor(int i) {
        DZ1.m110177k(getMessageCloseButtonView(), i);
    }

    public void setMessageHeaderText(String str) {
        getMessageHeaderTextView().setText(str);
    }

    public void setMessageHeaderTextAlignment(EnumC48393s06 enumC48393s06) {
        DZ1.m110180h(getMessageHeaderTextView(), enumC48393s06);
    }

    public void setMessageHeaderTextColor(int i) {
        DZ1.m110179i(getMessageHeaderTextView(), i);
    }

    public void setupDirectionalNavigation(int i) {
        List<View> messageButtonViews = getMessageButtonViews(i);
        final View messageCloseButtonView = getMessageCloseButtonView();
        int id = messageCloseButtonView.getId();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    String str = TAG;
                    C43664k20.m29421z(str, "Cannot setup directional navigation. Got unsupported number of buttons: " + i);
                } else {
                    View view = messageButtonViews.get(1);
                    View view2 = messageButtonViews.get(0);
                    int id2 = view.getId();
                    int id3 = view2.getId();
                    view.setNextFocusLeftId(id3);
                    view.setNextFocusRightId(id3);
                    view.setNextFocusUpId(id);
                    view.setNextFocusDownId(id);
                    view2.setNextFocusLeftId(id2);
                    view2.setNextFocusRightId(id2);
                    view2.setNextFocusUpId(id);
                    view2.setNextFocusDownId(id);
                    messageCloseButtonView.setNextFocusUpId(id2);
                    messageCloseButtonView.setNextFocusDownId(id2);
                    messageCloseButtonView.setNextFocusRightId(id2);
                    messageCloseButtonView.setNextFocusLeftId(id3);
                    messageCloseButtonView = view;
                    id = id2;
                }
            } else {
                View view3 = messageButtonViews.get(0);
                int id4 = view3.getId();
                view3.setNextFocusLeftId(id);
                view3.setNextFocusRightId(id);
                view3.setNextFocusUpId(id);
                view3.setNextFocusDownId(id);
                messageCloseButtonView.setNextFocusUpId(id4);
                messageCloseButtonView.setNextFocusDownId(id4);
                messageCloseButtonView.setNextFocusRightId(id4);
                messageCloseButtonView.setNextFocusLeftId(id4);
                messageCloseButtonView = view3;
                id = id4;
            }
        } else {
            messageCloseButtonView.setNextFocusUpId(id);
            messageCloseButtonView.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusRightId(id);
            messageCloseButtonView.setNextFocusLeftId(id);
        }
        setNextFocusUpId(id);
        setNextFocusDownId(id);
        setNextFocusRightId(id);
        setNextFocusLeftId(id);
        if (Build.VERSION.SDK_INT >= 26) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        messageCloseButtonView.post(new Runnable() { // from class: tZ1
            @Override // java.lang.Runnable
            public final void run() {
                messageCloseButtonView.requestFocus();
            }
        });
    }
}
