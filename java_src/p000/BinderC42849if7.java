package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmd;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmf;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmj;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmq;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: if7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC42849if7 extends O19 {

    /* renamed from: a */
    public final Context f87708a;

    /* renamed from: b */
    public final C36633Vl7 f87709b;

    /* renamed from: c */
    public final FaceDetectorV2Jni f87710c;

    /* renamed from: d */
    public long f87711d = -1;

    public BinderC42849if7(Context context, zzmh zzmhVar, FaceDetectorV2Jni faceDetectorV2Jni) {
        boolean z;
        String str;
        String str2;
        String str3;
        this.f87708a = context;
        boolean z2 = false;
        if (zzmhVar.zzc() == 2) {
            z = true;
        } else {
            z = false;
        }
        C35535Qt7 m104597u = C33204Gu7.m104597u();
        m104597u.m87648t("models_bundled");
        C33204Gu7 c33204Gu7 = (C33204Gu7) m104597u.m106921m();
        int m51297v = zzmhVar.m51297v();
        C35706Rm7 m98290u = C34077Kn7.m98290u();
        C35535Qt7 m104597u2 = C33204Gu7.m104597u();
        m104597u2.m87648t("models_bundled");
        if (m51297v == 2) {
            str = "fssd_medium_8bit_v5.tflite";
        } else {
            str = "fssd_25_8bit_v2.tflite";
        }
        m104597u2.m87649p(str);
        m98290u.m86304w((C33204Gu7) m104597u2.m106921m());
        C35535Qt7 m104597u3 = C33204Gu7.m104597u();
        m104597u3.m87648t("models_bundled");
        if (m51297v == 2) {
            str2 = "fssd_medium_8bit_gray_v5.tflite";
        } else {
            str2 = "fssd_25_8bit_gray_v2.tflite";
        }
        m104597u3.m87649p(str2);
        m98290u.m86305t((C33204Gu7) m104597u3.m106921m());
        C35535Qt7 m104597u4 = C33204Gu7.m104597u();
        m104597u4.m87648t("models_bundled");
        if (m51297v == 2) {
            str3 = "fssd_anchors_v5.pb";
        } else {
            str3 = "fssd_anchors_v2.pb";
        }
        m104597u4.m87649p(str3);
        m98290u.m86306p((C33204Gu7) m104597u4.m106921m());
        m98290u.m86303y(c33204Gu7);
        C37560Zk7 m79439u = C36633Vl7.m79439u();
        m79439u.m72554y((C34077Kn7) m98290u.m106921m());
        Co9 m115115u = Aq9.m115115u();
        m115115u.m111506p(c33204Gu7);
        m115115u.m111505t(c33204Gu7);
        m79439u.m72557p(m115115u);
        C51269wr7 m26713u = C44758ls7.m26713u();
        m26713u.m6214t(c33204Gu7);
        m26713u.m6213w(c33204Gu7);
        m26713u.m6212y(c33204Gu7);
        m26713u.m6215p(c33204Gu7);
        m79439u.m72553z(m26713u);
        m79439u.m72562B(z);
        if (!z && zzmhVar.m51296x()) {
            z2 = true;
        }
        m79439u.m72556t(z2);
        m79439u.m72563A(zzmhVar.m51299s());
        m79439u.m72561C(true);
        if (z) {
            m79439u.m72558H(4);
            m79439u.m72559G(4);
        } else {
            int m51297v2 = zzmhVar.m51297v();
            if (m51297v2 != 1) {
                if (m51297v2 == 2) {
                    m79439u.m72558H(3);
                }
            } else {
                m79439u.m72558H(2);
            }
            int zzd = zzmhVar.zzd();
            if (zzd != 1) {
                if (zzd == 2) {
                    m79439u.m72559G(3);
                }
            } else {
                m79439u.m72559G(2);
            }
            int m51298u = zzmhVar.m51298u();
            if (m51298u != 1) {
                if (m51298u == 2) {
                    m79439u.m72560D(3);
                }
            } else {
                m79439u.m72560D(2);
            }
        }
        this.f87709b = (C36633Vl7) m79439u.m106921m();
        this.f87710c = faceDetectorV2Jni;
    }

    /* renamed from: e5 */
    public static int m33612e5(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return 2;
                    }
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Unsupported rotation degree: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override // p000.Y19
    /* renamed from: c4 */
    public final List mo33614c4(WO1 wo1, zzmd zzmdVar) throws RemoteException {
        C39324ck7 m50538c;
        int m51301s = zzmdVar.m51301s();
        if (m51301s != -1) {
            if (m51301s != 17) {
                if (m51301s != 35) {
                    if (m51301s == 842094169) {
                        return m33611f5((ByteBuffer) BinderC36557Vd3.m79637d5(wo1), zzmdVar, 7);
                    }
                    int m51301s2 = zzmdVar.m51301s();
                    int i = Build.VERSION.SDK_INT;
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Unsupported image format ");
                    sb.append(m51301s2);
                    sb.append(" at API ");
                    sb.append(i);
                    String sb2 = sb.toString();
                    Log.e("ThickFaceDetector", sb2);
                    throw new RemoteException(sb2);
                }
                Image.Plane[] planes = ((Image) BinderC36557Vd3.m79637d5(wo1)).getPlanes();
                ByteBuffer buffer = planes[0].getBuffer();
                ByteBuffer buffer2 = planes[1].getBuffer();
                ByteBuffer buffer3 = planes[2].getBuffer();
                C39593d99 m42682u = C40459ed9.m42682u();
                m42682u.m44564w(zzmdVar.zzd());
                m42682u.m44566p(zzmdVar.zza());
                m42682u.m44562z(m33612e5(zzmdVar.zzc()));
                if (zzmdVar.m51300u() > 0) {
                    m42682u.m44565t(zzmdVar.m51300u() * 1000);
                }
                C40459ed9 c40459ed9 = (C40459ed9) m42682u.m106921m();
                if (buffer.isDirect()) {
                    m50538c = this.f87710c.m50536e(this.f87711d, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), c40459ed9);
                } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
                    m50538c = this.f87710c.m50538c(this.f87711d, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), c40459ed9);
                } else {
                    byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    buffer.get(bArr);
                    buffer.get(bArr);
                    m50538c = this.f87710c.m50538c(this.f87711d, bArr, new byte[buffer2.remaining()], new byte[buffer3.remaining()], planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), c40459ed9);
                }
                if (m50538c != null) {
                    return m33613d5(m50538c);
                }
                return new ArrayList();
            }
            return m33611f5((ByteBuffer) BinderC36557Vd3.m79637d5(wo1), zzmdVar, 2);
        }
        return m33611f5(OX7.m92026a((Bitmap) BinderC36557Vd3.m79637d5(wo1), true), zzmdVar, 2);
    }

    /* renamed from: d5 */
    public final List m33613d5(C39324ck7 c39324ck7) {
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        ArrayList arrayList2;
        float f4;
        int i;
        int i2;
        boolean z;
        ArrayList arrayList3 = new ArrayList();
        for (C43544jp9 c43544jp9 : c39324ck7.m60970w().m9687w()) {
            int i3 = 1;
            int i4 = -1;
            if (this.f87709b.m79444D() == 3) {
                float f5 = -1.0f;
                float f6 = -1.0f;
                float f7 = -1.0f;
                for (Hn9 hn9 : c43544jp9.m29857G()) {
                    String m103426w = hn9.m103426w();
                    int hashCode = m103426w.hashCode();
                    if (hashCode != -1940789646) {
                        if (hashCode != -1837755075) {
                            if (hashCode == 105428 && m103426w.equals("joy")) {
                                z = false;
                            }
                            z = true;
                        } else {
                            if (m103426w.equals("right_eye_closed")) {
                                z = true;
                            }
                            z = true;
                        }
                    } else {
                        if (m103426w.equals("left_eye_closed")) {
                            z = true;
                        }
                        z = true;
                    }
                    if (z) {
                        if (!z) {
                            if (z) {
                                f5 = 1.0f - hn9.m103428u();
                            }
                        } else {
                            f7 = 1.0f - hn9.m103428u();
                        }
                    } else {
                        f6 = hn9.m103428u();
                    }
                }
                f2 = f5;
                f3 = f6;
                f = f7;
            } else {
                f = -1.0f;
                f2 = -1.0f;
                f3 = -1.0f;
            }
            int i5 = 9;
            int i6 = 4;
            if (this.f87709b.m79443E() == 3) {
                List<C41765gp9> m29856w = c43544jp9.m29856w();
                ArrayList arrayList4 = new ArrayList();
                for (C41765gp9 c41765gp9 : m29856w) {
                    int m37432x = c41765gp9.m37432x() - 1;
                    if (m37432x != 0) {
                        if (m37432x != i3) {
                            if (m37432x != i5) {
                                switch (m37432x) {
                                    case 11:
                                        i2 = 0;
                                        break;
                                    case 12:
                                        i2 = 5;
                                        break;
                                    case 13:
                                        i2 = 11;
                                        break;
                                    default:
                                        switch (m37432x) {
                                            case 238:
                                                i2 = i3;
                                                break;
                                            case 239:
                                                i2 = 7;
                                                break;
                                            case 240:
                                                i2 = 3;
                                                break;
                                            case 241:
                                                i2 = 9;
                                                break;
                                            case 242:
                                                i2 = 2;
                                                break;
                                            case 243:
                                                i2 = 8;
                                                break;
                                            default:
                                                Log.d("ThickFaceDetector", "Unknown landmark type: ".concat(Integer.toString(m37432x)));
                                                i2 = -1;
                                                break;
                                        }
                                }
                            } else {
                                i2 = 6;
                            }
                        } else {
                            i2 = 10;
                        }
                    } else {
                        i2 = 4;
                    }
                    if (i2 >= 0) {
                        arrayList4.add(new zzmq(i2, new PointF(c41765gp9.m37435u(), c41765gp9.m37434v())));
                        i5 = 9;
                        i3 = 1;
                    } else {
                        i5 = 9;
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = new ArrayList();
            }
            if (this.f87709b.m79443E() == 4) {
                ArrayList arrayList5 = new ArrayList();
                for (C33330Hi7 c33330Hi7 : (List) c43544jp9.m83364v(C51902xv7.f118358a)) {
                    int m103502x = c33330Hi7.m103502x() + i4;
                    switch (m103502x) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = i6;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        case 7:
                            i = 7;
                            break;
                        case 8:
                            i = 8;
                            break;
                        case 9:
                            i = 9;
                            break;
                        case 10:
                            i = 10;
                            break;
                        case 11:
                            i = 11;
                            break;
                        case 12:
                            i = 12;
                            break;
                        case 13:
                            i = 13;
                            break;
                        case 14:
                            i = 14;
                            break;
                        case 15:
                            i = 15;
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(33);
                            sb.append("Unknown contour type: ");
                            sb.append(m103502x);
                            Log.d("ThickFaceDetector", sb.toString());
                            i = i4;
                            break;
                    }
                    if (i != i4) {
                        ArrayList arrayList6 = new ArrayList();
                        for (C47192py9 c47192py9 : c33330Hi7.m103503w()) {
                            arrayList6.add(new PointF(c47192py9.m18366u(), c47192py9.m18365v()));
                        }
                        arrayList5.add(new zzmf(i, arrayList6));
                        i4 = -1;
                        i6 = 4;
                    }
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = new ArrayList();
            }
            Nn9 m29860D = c43544jp9.m29860D();
            int m29861C = (int) c43544jp9.m29861C();
            Rect rect = new Rect((int) m29860D.m93402u(), (int) m29860D.m93400w(), (int) m29860D.m93401v(), (int) m29860D.m93399x());
            float m29863A = c43544jp9.m29863A();
            float m29853z = c43544jp9.m29853z();
            float m29862B = c43544jp9.m29862B();
            if (c43544jp9.m29855x()) {
                f4 = c43544jp9.m29854y();
            } else {
                f4 = -1.0f;
            }
            arrayList3.add(new zzmj(m29861C, rect, m29863A, m29853z, m29862B, f, f2, f3, f4, arrayList, arrayList2));
        }
        return arrayList3;
    }

    /* renamed from: f5 */
    public final List m33611f5(ByteBuffer byteBuffer, zzmd zzmdVar, int i) throws RemoteException {
        C39324ck7 m50539b;
        C39593d99 m42682u = C40459ed9.m42682u();
        m42682u.m44564w(zzmdVar.zzd());
        m42682u.m44566p(zzmdVar.zza());
        m42682u.m44562z(m33612e5(zzmdVar.zzc()));
        m42682u.m44563y(i);
        if (zzmdVar.m51300u() > 0) {
            m42682u.m44565t(zzmdVar.m51300u() * 1000);
        }
        C40459ed9 c40459ed9 = (C40459ed9) m42682u.m106921m();
        if (byteBuffer.isDirect()) {
            m50539b = this.f87710c.m50537d(this.f87711d, byteBuffer, c40459ed9);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            m50539b = this.f87710c.m50539b(this.f87711d, byteBuffer.array(), c40459ed9);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            m50539b = this.f87710c.m50539b(this.f87711d, bArr, c40459ed9);
        }
        if (m50539b != null) {
            return m33613d5(m50539b);
        }
        return new ArrayList();
    }

    @Override // p000.Y19
    public final void zzc() {
        this.f87711d = this.f87710c.m50540a(this.f87709b, this.f87708a.getAssets());
    }

    @Override // p000.Y19
    public final void zzd() {
        long j = this.f87711d;
        if (j > 0) {
            this.f87710c.m50535f(j);
            this.f87711d = -1L;
        }
    }
}