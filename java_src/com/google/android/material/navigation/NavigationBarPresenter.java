package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.SubMenuC11044l;
import com.google.android.material.badge.C17673b;
import com.google.android.material.internal.ParcelableSparseArray;
/* loaded from: classes6.dex */
public class NavigationBarPresenter implements InterfaceC11037i {

    /* renamed from: b */
    public C11028e f73099b;

    /* renamed from: c */
    public NavigationBarMenuView f73100c;

    /* renamed from: d */
    public boolean f73101d = false;

    /* renamed from: e */
    public int f73102e;

    /* loaded from: classes6.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17842a();

        /* renamed from: b */
        public int f73103b;

        /* renamed from: c */
        public ParcelableSparseArray f73104c;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17842a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f73103b);
            parcel.writeParcelable(this.f73104c, 0);
        }

        public SavedState(Parcel parcel) {
            this.f73103b = parcel.readInt();
            this.f73104c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    /* renamed from: a */
    public void m49326a(int i) {
        this.f73102e = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
    }

    /* renamed from: c */
    public void m49324c(NavigationBarMenuView navigationBarMenuView) {
        this.f73100c = navigationBarMenuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: d */
    public boolean mo12399d(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: e */
    public Parcelable mo49323e() {
        SavedState savedState = new SavedState();
        savedState.f73103b = this.f73100c.m49336l();
        savedState.f73104c = C17673b.m50260c(this.f73100c.m49340h());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: f */
    public void mo49322f(boolean z) {
        if (this.f73101d) {
            return;
        }
        if (z) {
            this.f73100c.m49343d();
        } else {
            this.f73100c.m49327u();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: g */
    public boolean mo49321g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    public int getId() {
        return this.f73102e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: h */
    public boolean mo12398h(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: i */
    public void mo12397i(Context context, C11028e c11028e) {
        this.f73099b = c11028e;
        this.f73100c.mo49346a(c11028e);
    }

    /* renamed from: k */
    public void m49320k(boolean z) {
        this.f73101d = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: l */
    public void mo49319l(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f73100c.m49328t(savedState.f73103b);
            this.f73100c.m49331q(C17673b.m50261b(this.f73100c.getContext(), savedState.f73104c));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        return false;
    }
}
