package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.joran.action.Action;
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C11674g implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final FragmentManager f54714b;

    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC11675a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C11680j f54715b;

        public View$OnAttachStateChangeListenerC11675a(C11680j c11680j) {
            this.f54715b = c11680j;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m67165k = this.f54715b.m67165k();
            this.f54715b.m67163m();
            AbstractC11688o.m67077o((ViewGroup) m67165k.mView.getParent(), LayoutInflater$Factory2C11674g.this.f54714b).m67082j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflater$Factory2C11674g(FragmentManager fragmentManager) {
        this.f54714b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C11680j m67287y;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f54714b);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C41730gm4.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(C41730gm4.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(C41730gm4.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(C41730gm4.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !C11672e.isFragmentClass(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment m67325l0 = resourceId != -1 ? this.f54714b.m67325l0(resourceId) : null;
            if (m67325l0 == null && string != null) {
                m67325l0 = this.f54714b.m67322m0(string);
            }
            if (m67325l0 == null && id != -1) {
                m67325l0 = this.f54714b.m67325l0(id);
            }
            if (m67325l0 == null) {
                m67325l0 = this.f54714b.m67286y0().instantiate(context.getClassLoader(), attributeValue);
                m67325l0.mFromLayout = true;
                m67325l0.mFragmentId = resourceId != 0 ? resourceId : id;
                m67325l0.mContainerId = id;
                m67325l0.mTag = string;
                m67325l0.mInLayout = true;
                FragmentManager fragmentManager = this.f54714b;
                m67325l0.mFragmentManager = fragmentManager;
                m67325l0.mHost = fragmentManager.m67420A0();
                m67325l0.onInflate(this.f54714b.m67420A0().m67214f(), attributeSet, m67325l0.mSavedFragmentState);
                m67287y = this.f54714b.m67332j(m67325l0);
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "Fragment " + m67325l0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!m67325l0.mInLayout) {
                m67325l0.mInLayout = true;
                FragmentManager fragmentManager2 = this.f54714b;
                m67325l0.mFragmentManager = fragmentManager2;
                m67325l0.mHost = fragmentManager2.m67420A0();
                m67325l0.onInflate(this.f54714b.m67420A0().m67214f(), attributeSet, m67325l0.mSavedFragmentState);
                m67287y = this.f54714b.m67287y(m67325l0);
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + m67325l0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            C53112zy1.m74g(m67325l0, viewGroup);
            m67325l0.mContainer = viewGroup;
            m67287y.m67163m();
            m67287y.m67166j();
            View view2 = m67325l0.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m67325l0.mView.getTag() == null) {
                    m67325l0.mView.setTag(string);
                }
                m67325l0.mView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC11675a(m67287y));
                return m67325l0.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
