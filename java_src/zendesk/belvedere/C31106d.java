package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import zendesk.belvedere.C31103c;
import zendesk.belvedere.FixedWidthImageView;
import zendesk.belvedere.SelectableView;
/* renamed from: zendesk.belvedere.d */
/* loaded from: classes8.dex */
public class C31106d {

    /* renamed from: a */
    public static final int f121826a = C33075Gg4.belvedere_ic_camera_black;

    /* renamed from: b */
    public static final int f121827b = C32175Ck4.belvedere_stream_list_item_square_static;

    /* renamed from: zendesk.belvedere.d$a */
    /* loaded from: classes8.dex */
    public static class View$OnClickListenerC31107a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C31103c.InterfaceC31105b f121828b;

        public View$OnClickListenerC31107a(C31103c.InterfaceC31105b interfaceC31105b) {
            this.f121828b = interfaceC31105b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f121828b.mo697b();
        }
    }

    /* renamed from: zendesk.belvedere.d$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC31108b {

        /* renamed from: a */
        public final int f121829a;

        /* renamed from: c */
        public final MediaResult f121831c;

        /* renamed from: b */
        public final long f121830b = UUID.randomUUID().hashCode();

        /* renamed from: d */
        public boolean f121832d = false;

        public AbstractC31108b(int i, MediaResult mediaResult) {
            this.f121829a = i;
            this.f121831c = mediaResult;
        }

        /* renamed from: a */
        public abstract void mo728a(View view);

        /* renamed from: b */
        public long m735b() {
            return this.f121830b;
        }

        /* renamed from: c */
        public int m734c() {
            return this.f121829a;
        }

        /* renamed from: d */
        public MediaResult m733d() {
            return this.f121831c;
        }

        /* renamed from: e */
        public boolean m732e() {
            return this.f121832d;
        }

        /* renamed from: f */
        public void m731f(boolean z) {
            this.f121832d = z;
        }
    }

    /* renamed from: zendesk.belvedere.d$c */
    /* loaded from: classes8.dex */
    public static class C31109c extends AbstractC31108b {

        /* renamed from: e */
        public final int f121833e;

        /* renamed from: f */
        public final View.OnClickListener f121834f;

        public /* synthetic */ C31109c(int i, int i2, View.OnClickListener onClickListener, View$OnClickListenerC31107a view$OnClickListenerC31107a) {
            this(i, i2, onClickListener);
        }

        @Override // zendesk.belvedere.C31106d.AbstractC31108b
        /* renamed from: a */
        public void mo728a(View view) {
            ((ImageView) view.findViewById(C35883Sg4.list_item_static_image)).setImageResource(this.f121833e);
            view.findViewById(C35883Sg4.list_item_static_click_area).setOnClickListener(this.f121834f);
        }

        public C31109c(int i, int i2, View.OnClickListener onClickListener) {
            super(i, null);
            this.f121833e = i2;
            this.f121834f = onClickListener;
        }
    }

    /* renamed from: zendesk.belvedere.d$d */
    /* loaded from: classes8.dex */
    public static class C31110d extends AbstractC31108b {

        /* renamed from: e */
        public final MediaResult f121835e;

        /* renamed from: f */
        public final ResolveInfo f121836f;

        /* renamed from: g */
        public final C31103c.InterfaceC31105b f121837g;

        /* renamed from: zendesk.belvedere.d$d$a */
        /* loaded from: classes8.dex */
        public class C31111a implements SelectableView.InterfaceC31095c {
            public C31111a() {
            }

            @Override // zendesk.belvedere.SelectableView.InterfaceC31095c
            /* renamed from: a */
            public boolean mo724a(boolean z) {
                return C31110d.this.f121837g.mo698a(C31110d.this);
            }
        }

        public C31110d(C31103c.InterfaceC31105b interfaceC31105b, MediaResult mediaResult, Context context) {
            super(C32175Ck4.belvedere_stream_list_item_genric_file, mediaResult);
            this.f121835e = mediaResult;
            this.f121836f = m729h(mediaResult.m782g(), context);
            this.f121837g = interfaceC31105b;
        }

        @Override // zendesk.belvedere.C31106d.AbstractC31108b
        /* renamed from: a */
        public void mo728a(View view) {
            Context context = view.getContext();
            ImageView imageView = (ImageView) view.findViewById(C35883Sg4.list_item_file_icon);
            TextView textView = (TextView) view.findViewById(C35883Sg4.list_item_file_label);
            SelectableView selectableView = (SelectableView) view.findViewById(C35883Sg4.list_item_file_holder);
            selectableView.setContentDescriptionStrings(context.getString(C44092kl4.belvedere_stream_item_unselect_file_desc, this.f121835e.m782g()), context.getString(C44092kl4.belvedere_stream_item_select_file_desc, this.f121835e.m782g()));
            ((TextView) view.findViewById(C35883Sg4.list_item_file_title)).setText(this.f121835e.m782g());
            if (this.f121836f != null) {
                PackageManager packageManager = context.getPackageManager();
                textView.setText(this.f121836f.loadLabel(packageManager));
                imageView.setImageDrawable(this.f121836f.loadIcon(packageManager));
            } else {
                textView.setText(C44092kl4.belvedere_image_stream_unknown_app);
                imageView.setImageResource(17301651);
            }
            selectableView.setSelected(m732e());
            selectableView.setSelectionListener(new C31111a());
        }

        /* renamed from: h */
        public final ResolveInfo m729h(String str, Context context) {
            PackageManager packageManager = context.getPackageManager();
            MediaResult m763d = C31096a.m764c(context).m763d("tmp", str);
            if (m763d == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(m763d.m779j());
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return null;
            }
            return queryIntentActivities.get(0);
        }
    }

    /* renamed from: zendesk.belvedere.d$e */
    /* loaded from: classes8.dex */
    public static class C31112e extends AbstractC31108b {

        /* renamed from: e */
        public final MediaResult f121839e;

        /* renamed from: f */
        public final C31103c.InterfaceC31105b f121840f;

        /* renamed from: g */
        public FixedWidthImageView.C31080b f121841g;

        /* renamed from: zendesk.belvedere.d$e$a */
        /* loaded from: classes8.dex */
        public class C31113a implements FixedWidthImageView.InterfaceC31081c {
            public C31113a() {
            }

            @Override // zendesk.belvedere.FixedWidthImageView.InterfaceC31081c
            /* renamed from: a */
            public void mo725a(FixedWidthImageView.C31080b c31080b) {
                C31112e.this.f121841g = c31080b;
            }
        }

        /* renamed from: zendesk.belvedere.d$e$b */
        /* loaded from: classes8.dex */
        public class C31114b implements SelectableView.InterfaceC31095c {
            public C31114b() {
            }

            @Override // zendesk.belvedere.SelectableView.InterfaceC31095c
            /* renamed from: a */
            public boolean mo724a(boolean z) {
                return C31112e.this.f121840f.mo698a(C31112e.this);
            }
        }

        public C31112e(C31103c.InterfaceC31105b interfaceC31105b, MediaResult mediaResult) {
            super(C32175Ck4.belvedere_stream_list_item, mediaResult);
            this.f121840f = interfaceC31105b;
            this.f121839e = mediaResult;
        }

        @Override // zendesk.belvedere.C31106d.AbstractC31108b
        /* renamed from: a */
        public void mo728a(View view) {
            Context context = view.getContext();
            FixedWidthImageView fixedWidthImageView = (FixedWidthImageView) view.findViewById(C35883Sg4.list_item_image);
            SelectableView selectableView = (SelectableView) view.findViewById(C35883Sg4.list_item_selectable);
            selectableView.setContentDescriptionStrings(context.getString(C44092kl4.belvedere_stream_item_unselect_image_desc, this.f121839e.m782g()), context.getString(C44092kl4.belvedere_stream_item_select_image_desc, this.f121839e.m782g()));
            if (this.f121841g != null) {
                fixedWidthImageView.m840f(C42732iT3.m33881h(), this.f121839e.m781h(), this.f121841g);
            } else {
                fixedWidthImageView.m841e(C42732iT3.m33881h(), this.f121839e.m781h(), this.f121839e.m778k(), this.f121839e.m784d(), new C31113a());
            }
            selectableView.setSelected(m732e());
            selectableView.setSelectionListener(new C31114b());
        }
    }

    /* renamed from: a */
    public static C31109c m737a(C31103c.InterfaceC31105b interfaceC31105b) {
        return new C31109c(f121827b, f121826a, new View$OnClickListenerC31107a(interfaceC31105b), null);
    }

    /* renamed from: b */
    public static List<AbstractC31108b> m736b(List<MediaResult> list, C31103c.InterfaceC31105b interfaceC31105b, Context context) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaResult mediaResult : list) {
            if (mediaResult.m783e() != null && mediaResult.m783e().startsWith(Entry.TYPE_IMAGE)) {
                arrayList.add(new C31112e(interfaceC31105b, mediaResult));
            } else {
                arrayList.add(new C31110d(interfaceC31105b, mediaResult, context));
            }
        }
        return arrayList;
    }
}
