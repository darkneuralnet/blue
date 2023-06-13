package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.InterfaceC17126a;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC17126a<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f69161a;

    /* loaded from: classes5.dex */
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f69162a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f69162a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f69162a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f69162a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    /* loaded from: classes5.dex */
    public static final class C17125a implements InterfaceC17126a.InterfaceC17127a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo53089a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: c */
        public InterfaceC17126a<ParcelFileDescriptor> mo53088b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f69161a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: b */
    public static boolean m53097b() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC17126a
    /* renamed from: c */
    public ParcelFileDescriptor mo53092a() throws IOException {
        return this.f69161a.rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC17126a
    public void cleanup() {
    }
}
