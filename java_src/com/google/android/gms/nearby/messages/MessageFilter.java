package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzhg;
import com.google.android.gms.internal.nearby.zzhl;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@SafeParcelable.Class(creator = "MessageFilterCreator")
/* loaded from: classes6.dex */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageFilter> CREATOR = new C41990hC7();

    /* renamed from: h */
    public static final MessageFilter f71639h;
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71640b;
    @SafeParcelable.Field(getter = "getMessageTypes", m51606id = 1)

    /* renamed from: c */
    public final List<zzac> f71641c;
    @SafeParcelable.Field(getter = "getDeviceFilters", m51606id = 2)

    /* renamed from: d */
    public final List<zzhl> f71642d;
    @SafeParcelable.Field(getter = "getIncludeAllMyTypes", m51606id = 3)

    /* renamed from: e */
    public final boolean f71643e;
    @SafeParcelable.Field(getter = "getBleFilters", m51606id = 4)

    /* renamed from: f */
    public final List<zzhg> f71644f;
    @SafeParcelable.Field(getter = "getNumRawAudioBytes", m51606id = 5)

    /* renamed from: g */
    public final int f71645g;

    /* renamed from: com.google.android.gms.nearby.messages.MessageFilter$a */
    /* loaded from: classes6.dex */
    public static final class C17622a {

        /* renamed from: d */
        public boolean f71649d;

        /* renamed from: a */
        public final Set<zzac> f71646a = new HashSet();

        /* renamed from: b */
        public final List<zzhl> f71647b = new ArrayList();

        /* renamed from: c */
        public final Set<zzhg> f71648c = new HashSet();

        /* renamed from: e */
        public int f71650e = 0;

        /* renamed from: a */
        public MessageFilter m50566a() {
            boolean z = true;
            if (!this.f71649d && this.f71646a.isEmpty()) {
                z = false;
            }
            Preconditions.checkState(z, "At least one of the include methods must be called.");
            return new MessageFilter(2, new ArrayList(this.f71646a), this.f71647b, this.f71649d, new ArrayList(this.f71648c), this.f71650e);
        }

        /* renamed from: b */
        public C17622a m50565b() {
            this.f71649d = true;
            return this;
        }
    }

    static {
        C17622a c17622a = new C17622a();
        c17622a.m50565b();
        f71639h = c17622a.m50566a();
    }

    @SafeParcelable.Constructor
    public MessageFilter(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 1) List<zzac> list, @SafeParcelable.Param(m51605id = 2) List<zzhl> list2, @SafeParcelable.Param(m51605id = 3) boolean z, @SafeParcelable.Param(m51605id = 4) List<zzhg> list3, @SafeParcelable.Param(m51605id = 5) int i2) {
        this.f71640b = i;
        this.f71641c = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
        this.f71643e = z;
        this.f71642d = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f71644f = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.f71645g = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        if (this.f71643e == messageFilter.f71643e && Objects.equal(this.f71641c, messageFilter.f71641c) && Objects.equal(this.f71642d, messageFilter.f71642d) && Objects.equal(this.f71644f, messageFilter.f71644f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71641c, this.f71642d, Boolean.valueOf(this.f71643e), this.f71644f);
    }

    public String toString() {
        boolean z = this.f71643e;
        String valueOf = String.valueOf(this.f71641c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 53);
        sb.append("MessageFilter{includeAllMyTypes=");
        sb.append(z);
        sb.append(", messageTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f71641c, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f71642d, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71643e);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f71644f, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f71645g);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71640b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
