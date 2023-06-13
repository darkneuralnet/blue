package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import net.danlew.android.joda.DateUtils;
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f51479A;

    /* renamed from: C */
    public Drawable f51481C;

    /* renamed from: D */
    public ImageView f51482D;

    /* renamed from: E */
    public TextView f51483E;

    /* renamed from: F */
    public TextView f51484F;

    /* renamed from: G */
    public View f51485G;

    /* renamed from: H */
    public ListAdapter f51486H;

    /* renamed from: J */
    public int f51488J;

    /* renamed from: K */
    public int f51489K;

    /* renamed from: L */
    public int f51490L;

    /* renamed from: M */
    public int f51491M;

    /* renamed from: N */
    public int f51492N;

    /* renamed from: O */
    public int f51493O;

    /* renamed from: P */
    public boolean f51494P;

    /* renamed from: R */
    public Handler f51496R;

    /* renamed from: a */
    public final Context f51498a;

    /* renamed from: b */
    public final DialogC26167mi f51499b;

    /* renamed from: c */
    public final Window f51500c;

    /* renamed from: d */
    public final int f51501d;

    /* renamed from: e */
    public CharSequence f51502e;

    /* renamed from: f */
    public CharSequence f51503f;

    /* renamed from: g */
    public ListView f51504g;

    /* renamed from: h */
    public View f51505h;

    /* renamed from: i */
    public int f51506i;

    /* renamed from: j */
    public int f51507j;

    /* renamed from: k */
    public int f51508k;

    /* renamed from: l */
    public int f51509l;

    /* renamed from: m */
    public int f51510m;

    /* renamed from: o */
    public Button f51512o;

    /* renamed from: p */
    public CharSequence f51513p;

    /* renamed from: q */
    public Message f51514q;

    /* renamed from: r */
    public Drawable f51515r;

    /* renamed from: s */
    public Button f51516s;

    /* renamed from: t */
    public CharSequence f51517t;

    /* renamed from: u */
    public Message f51518u;

    /* renamed from: v */
    public Drawable f51519v;

    /* renamed from: w */
    public Button f51520w;

    /* renamed from: x */
    public CharSequence f51521x;

    /* renamed from: y */
    public Message f51522y;

    /* renamed from: z */
    public Drawable f51523z;

    /* renamed from: n */
    public boolean f51511n = false;

    /* renamed from: B */
    public int f51480B = 0;

    /* renamed from: I */
    public int f51487I = -1;

    /* renamed from: Q */
    public int f51495Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f51497S = new View$OnClickListenerC10954a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f51524b;

        /* renamed from: c */
        public final int f51525c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f51524b;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f51525c;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43509jm4.RecycleListView);
            this.f51525c = obtainStyledAttributes.getDimensionPixelOffset(C43509jm4.RecycleListView_paddingBottomNoButtons, -1);
            this.f51524b = obtainStyledAttributes.getDimensionPixelOffset(C43509jm4.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC10954a implements View.OnClickListener {
        public View$OnClickListenerC10954a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f51512o && (message4 = alertController.f51514q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f51516s && (message3 = alertController.f51518u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f51520w && (message2 = alertController.f51522y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f51496R.obtainMessage(1, alertController2.f51499b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public static class C10955b {

        /* renamed from: A */
        public int f51527A;

        /* renamed from: B */
        public int f51528B;

        /* renamed from: C */
        public int f51529C;

        /* renamed from: D */
        public int f51530D;

        /* renamed from: F */
        public boolean[] f51532F;

        /* renamed from: G */
        public boolean f51533G;

        /* renamed from: H */
        public boolean f51534H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f51536J;

        /* renamed from: K */
        public Cursor f51537K;

        /* renamed from: L */
        public String f51538L;

        /* renamed from: M */
        public String f51539M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f51540N;

        /* renamed from: a */
        public final Context f51542a;

        /* renamed from: b */
        public final LayoutInflater f51543b;

        /* renamed from: d */
        public Drawable f51545d;

        /* renamed from: f */
        public CharSequence f51547f;

        /* renamed from: g */
        public View f51548g;

        /* renamed from: h */
        public CharSequence f51549h;

        /* renamed from: i */
        public CharSequence f51550i;

        /* renamed from: j */
        public Drawable f51551j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f51552k;

        /* renamed from: l */
        public CharSequence f51553l;

        /* renamed from: m */
        public Drawable f51554m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f51555n;

        /* renamed from: o */
        public CharSequence f51556o;

        /* renamed from: p */
        public Drawable f51557p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f51558q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f51560s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f51561t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f51562u;

        /* renamed from: v */
        public CharSequence[] f51563v;

        /* renamed from: w */
        public ListAdapter f51564w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f51565x;

        /* renamed from: y */
        public int f51566y;

        /* renamed from: z */
        public View f51567z;

        /* renamed from: c */
        public int f51544c = 0;

        /* renamed from: e */
        public int f51546e = 0;

        /* renamed from: E */
        public boolean f51531E = false;

        /* renamed from: I */
        public int f51535I = -1;

        /* renamed from: O */
        public boolean f51541O = true;

        /* renamed from: r */
        public boolean f51559r = true;

        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        /* loaded from: classes.dex */
        public class C10956a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            public final /* synthetic */ RecycleListView f51568b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10956a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f51568b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C10955b.this.f51532F;
                if (zArr != null && zArr[i]) {
                    this.f51568b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        /* loaded from: classes.dex */
        public class C10957b extends CursorAdapter {

            /* renamed from: b */
            public final int f51570b;

            /* renamed from: c */
            public final int f51571c;

            /* renamed from: d */
            public final /* synthetic */ RecycleListView f51572d;

            /* renamed from: e */
            public final /* synthetic */ AlertController f51573e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10957b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f51572d = recycleListView;
                this.f51573e = alertController;
                Cursor cursor2 = getCursor();
                this.f51570b = cursor2.getColumnIndexOrThrow(C10955b.this.f51538L);
                this.f51571c = cursor2.getColumnIndexOrThrow(C10955b.this.f51539M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f51570b));
                RecycleListView recycleListView = this.f51572d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f51571c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C10955b.this.f51543b.inflate(this.f51573e.f51491M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        /* loaded from: classes.dex */
        public class C10958c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final /* synthetic */ AlertController f51575b;

            public C10958c(AlertController alertController) {
                this.f51575b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C10955b.this.f51565x.onClick(this.f51575b.f51499b, i);
                if (!C10955b.this.f51534H) {
                    this.f51575b.f51499b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        /* loaded from: classes.dex */
        public class C10959d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final /* synthetic */ RecycleListView f51577b;

            /* renamed from: c */
            public final /* synthetic */ AlertController f51578c;

            public C10959d(RecycleListView recycleListView, AlertController alertController) {
                this.f51577b = recycleListView;
                this.f51578c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C10955b.this.f51532F;
                if (zArr != null) {
                    zArr[i] = this.f51577b.isItemChecked(i);
                }
                C10955b.this.f51536J.onClick(this.f51578c.f51499b, i, this.f51577b.isItemChecked(i));
            }
        }

        public C10955b(Context context) {
            this.f51542a = context;
            this.f51543b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m70427a(AlertController alertController) {
            View view = this.f51548g;
            if (view != null) {
                alertController.m70442k(view);
            } else {
                CharSequence charSequence = this.f51547f;
                if (charSequence != null) {
                    alertController.m70437p(charSequence);
                }
                Drawable drawable = this.f51545d;
                if (drawable != null) {
                    alertController.m70440m(drawable);
                }
                int i = this.f51544c;
                if (i != 0) {
                    alertController.m70441l(i);
                }
                int i2 = this.f51546e;
                if (i2 != 0) {
                    alertController.m70441l(alertController.m70450c(i2));
                }
            }
            CharSequence charSequence2 = this.f51549h;
            if (charSequence2 != null) {
                alertController.m70439n(charSequence2);
            }
            CharSequence charSequence3 = this.f51550i;
            if (charSequence3 != null || this.f51551j != null) {
                alertController.m70443j(-1, charSequence3, this.f51552k, null, this.f51551j);
            }
            CharSequence charSequence4 = this.f51553l;
            if (charSequence4 != null || this.f51554m != null) {
                alertController.m70443j(-2, charSequence4, this.f51555n, null, this.f51554m);
            }
            CharSequence charSequence5 = this.f51556o;
            if (charSequence5 != null || this.f51557p != null) {
                alertController.m70443j(-3, charSequence5, this.f51558q, null, this.f51557p);
            }
            if (this.f51563v != null || this.f51537K != null || this.f51564w != null) {
                m70426b(alertController);
            }
            View view2 = this.f51567z;
            if (view2 != null) {
                if (this.f51531E) {
                    alertController.m70434s(view2, this.f51527A, this.f51528B, this.f51529C, this.f51530D);
                    return;
                } else {
                    alertController.m70435r(view2);
                    return;
                }
            }
            int i3 = this.f51566y;
            if (i3 != 0) {
                alertController.m70436q(i3);
            }
        }

        /* renamed from: b */
        public final void m70426b(AlertController alertController) {
            int i;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f51543b.inflate(alertController.f51490L, (ViewGroup) null);
            if (this.f51533G) {
                if (this.f51537K == null) {
                    listAdapter = new C10956a(this.f51542a, alertController.f51491M, 16908308, this.f51563v, recycleListView);
                } else {
                    listAdapter = new C10957b(this.f51542a, this.f51537K, false, recycleListView, alertController);
                }
            } else {
                if (this.f51534H) {
                    i = alertController.f51492N;
                } else {
                    i = alertController.f51493O;
                }
                int i2 = i;
                if (this.f51537K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f51542a, i2, this.f51537K, new String[]{this.f51538L}, new int[]{16908308});
                } else {
                    listAdapter = this.f51564w;
                    if (listAdapter == null) {
                        listAdapter = new C10961d(this.f51542a, i2, 16908308, this.f51563v);
                    }
                }
            }
            alertController.f51486H = listAdapter;
            alertController.f51487I = this.f51535I;
            if (this.f51565x != null) {
                recycleListView.setOnItemClickListener(new C10958c(alertController));
            } else if (this.f51536J != null) {
                recycleListView.setOnItemClickListener(new C10959d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f51540N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f51534H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f51533G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f51504g = recycleListView;
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public static final class HandlerC10960c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f51580a;

        public HandlerC10960c(DialogInterface dialogInterface) {
            this.f51580a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != -3 && i != -2 && i != -1) {
                if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f51580a.get(), message.what);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public static class C10961d extends ArrayAdapter<CharSequence> {
        public C10961d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC26167mi dialogC26167mi, Window window) {
        this.f51498a = context;
        this.f51499b = dialogC26167mi;
        this.f51500c = window;
        this.f51496R = new HandlerC10960c(dialogC26167mi);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C43509jm4.AlertDialog, C50553vf4.alertDialogStyle, 0);
        this.f51488J = obtainStyledAttributes.getResourceId(C43509jm4.AlertDialog_android_layout, 0);
        this.f51489K = obtainStyledAttributes.getResourceId(C43509jm4.AlertDialog_buttonPanelSideLayout, 0);
        this.f51490L = obtainStyledAttributes.getResourceId(C43509jm4.AlertDialog_listLayout, 0);
        this.f51491M = obtainStyledAttributes.getResourceId(C43509jm4.AlertDialog_multiChoiceItemLayout, 0);
        this.f51492N = obtainStyledAttributes.getResourceId(C43509jm4.AlertDialog_singleChoiceItemLayout, 0);
        this.f51493O = obtainStyledAttributes.getResourceId(C43509jm4.AlertDialog_listItemLayout, 0);
        this.f51494P = obtainStyledAttributes.getBoolean(C43509jm4.AlertDialog_showTitle, true);
        this.f51501d = obtainStyledAttributes.getDimensionPixelSize(C43509jm4.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC26167mi.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    public static boolean m70452a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m70452a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m70428y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C50553vf4.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m70451b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public int m70450c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f51498a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m70449d() {
        return this.f51504g;
    }

    /* renamed from: e */
    public void m70448e() {
        this.f51499b.setContentView(m70444i());
        m70429x();
    }

    /* renamed from: f */
    public boolean m70447f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f51479A;
        return nestedScrollView != null && nestedScrollView.m67635m(keyEvent);
    }

    /* renamed from: g */
    public boolean m70446g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f51479A;
        return nestedScrollView != null && nestedScrollView.m67635m(keyEvent);
    }

    /* renamed from: h */
    public final ViewGroup m70445h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: i */
    public final int m70444i() {
        int i = this.f51489K;
        if (i == 0) {
            return this.f51488J;
        }
        if (this.f51495Q == 1) {
            return i;
        }
        return this.f51488J;
    }

    /* renamed from: j */
    public void m70443j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f51496R.obtainMessage(i, onClickListener);
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.f51513p = charSequence;
                    this.f51514q = message;
                    this.f51515r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f51517t = charSequence;
            this.f51518u = message;
            this.f51519v = drawable;
            return;
        }
        this.f51521x = charSequence;
        this.f51522y = message;
        this.f51523z = drawable;
    }

    /* renamed from: k */
    public void m70442k(View view) {
        this.f51485G = view;
    }

    /* renamed from: l */
    public void m70441l(int i) {
        this.f51481C = null;
        this.f51480B = i;
        ImageView imageView = this.f51482D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f51482D.setImageResource(this.f51480B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: m */
    public void m70440m(Drawable drawable) {
        this.f51481C = drawable;
        this.f51480B = 0;
        ImageView imageView = this.f51482D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f51482D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: n */
    public void m70439n(CharSequence charSequence) {
        this.f51503f = charSequence;
        TextView textView = this.f51484F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: o */
    public final void m70438o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f51500c.findViewById(C39902dh4.scrollIndicatorUp);
        View findViewById2 = this.f51500c.findViewById(C39902dh4.scrollIndicatorDown);
        C38790bq6.m62509W0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: p */
    public void m70437p(CharSequence charSequence) {
        this.f51502e = charSequence;
        TextView textView = this.f51483E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m70436q(int i) {
        this.f51505h = null;
        this.f51506i = i;
        this.f51511n = false;
    }

    /* renamed from: r */
    public void m70435r(View view) {
        this.f51505h = view;
        this.f51506i = 0;
        this.f51511n = false;
    }

    /* renamed from: s */
    public void m70434s(View view, int i, int i2, int i3, int i4) {
        this.f51505h = view;
        this.f51506i = 0;
        this.f51511n = true;
        this.f51507j = i;
        this.f51508k = i2;
        this.f51509l = i3;
        this.f51510m = i4;
    }

    /* renamed from: t */
    public final void m70433t(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f51512o = button;
        button.setOnClickListener(this.f51497S);
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f51513p) && this.f51515r == null) {
            this.f51512o.setVisibility(8);
            z = false;
        } else {
            this.f51512o.setText(this.f51513p);
            Drawable drawable = this.f51515r;
            if (drawable != null) {
                int i = this.f51501d;
                drawable.setBounds(0, 0, i, i);
                this.f51512o.setCompoundDrawables(this.f51515r, null, null, null);
            }
            this.f51512o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f51516s = button2;
        button2.setOnClickListener(this.f51497S);
        if (TextUtils.isEmpty(this.f51517t) && this.f51519v == null) {
            this.f51516s.setVisibility(8);
        } else {
            this.f51516s.setText(this.f51517t);
            Drawable drawable2 = this.f51519v;
            if (drawable2 != null) {
                int i2 = this.f51501d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f51516s.setCompoundDrawables(this.f51519v, null, null, null);
            }
            this.f51516s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f51520w = button3;
        button3.setOnClickListener(this.f51497S);
        if (TextUtils.isEmpty(this.f51521x) && this.f51523z == null) {
            this.f51520w.setVisibility(8);
        } else {
            this.f51520w.setText(this.f51521x);
            Drawable drawable3 = this.f51523z;
            if (drawable3 != null) {
                int i3 = this.f51501d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f51520w.setCompoundDrawables(this.f51523z, null, null, null);
            }
            this.f51520w.setVisibility(0);
            z |= true;
        }
        if (m70428y(this.f51498a)) {
            if (z) {
                m70451b(this.f51512o);
            } else if (z) {
                m70451b(this.f51516s);
            } else if (z) {
                m70451b(this.f51520w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: u */
    public final void m70432u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f51500c.findViewById(C39902dh4.scrollView);
        this.f51479A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f51479A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f51484F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f51503f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f51479A.removeView(this.f51484F);
        if (this.f51504g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f51479A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f51479A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f51504g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    public final void m70431v(ViewGroup viewGroup) {
        View view = this.f51505h;
        boolean z = false;
        if (view == null) {
            if (this.f51506i != 0) {
                view = LayoutInflater.from(this.f51498a).inflate(this.f51506i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m70452a(view)) {
            this.f51500c.setFlags(DateUtils.FORMAT_NUMERIC_DATE, DateUtils.FORMAT_NUMERIC_DATE);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f51500c.findViewById(C39902dh4.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f51511n) {
                frameLayout.setPadding(this.f51507j, this.f51508k, this.f51509l, this.f51510m);
            }
            if (this.f51504g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    public final void m70430w(ViewGroup viewGroup) {
        if (this.f51485G != null) {
            viewGroup.addView(this.f51485G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f51500c.findViewById(C39902dh4.title_template).setVisibility(8);
            return;
        }
        this.f51482D = (ImageView) this.f51500c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f51502e)) && this.f51494P) {
            TextView textView = (TextView) this.f51500c.findViewById(C39902dh4.alertTitle);
            this.f51483E = textView;
            textView.setText(this.f51502e);
            int i = this.f51480B;
            if (i != 0) {
                this.f51482D.setImageResource(i);
                return;
            }
            Drawable drawable = this.f51481C;
            if (drawable != null) {
                this.f51482D.setImageDrawable(drawable);
                return;
            }
            this.f51483E.setPadding(this.f51482D.getPaddingLeft(), this.f51482D.getPaddingTop(), this.f51482D.getPaddingRight(), this.f51482D.getPaddingBottom());
            this.f51482D.setVisibility(8);
            return;
        }
        this.f51500c.findViewById(C39902dh4.title_template).setVisibility(8);
        this.f51482D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final void m70429x() {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f51500c.findViewById(C39902dh4.parentPanel);
        int i = C39902dh4.topPanel;
        View findViewById5 = findViewById4.findViewById(i);
        int i2 = C39902dh4.contentPanel;
        View findViewById6 = findViewById4.findViewById(i2);
        int i3 = C39902dh4.buttonPanel;
        View findViewById7 = findViewById4.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(C39902dh4.customPanel);
        m70431v(viewGroup);
        View findViewById8 = viewGroup.findViewById(i);
        View findViewById9 = viewGroup.findViewById(i2);
        View findViewById10 = viewGroup.findViewById(i3);
        ViewGroup m70445h = m70445h(findViewById8, findViewById5);
        ViewGroup m70445h2 = m70445h(findViewById9, findViewById6);
        ViewGroup m70445h3 = m70445h(findViewById10, findViewById7);
        m70432u(m70445h2);
        m70433t(m70445h3);
        m70430w(m70445h);
        int i4 = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (m70445h != null && m70445h.getVisibility() != 8) {
            z2 = 1;
        } else {
            z2 = false;
        }
        if (m70445h3 != null && m70445h3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && m70445h2 != null && (findViewById3 = m70445h2.findViewById(C39902dh4.textSpacerNoButtons)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f51479A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f51503f == null && this.f51504g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = m70445h.findViewById(C39902dh4.titleDividerNoCustom);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (m70445h2 != null && (findViewById = m70445h2.findViewById(C39902dh4.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f51504g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view = this.f51504g;
            if (view == null) {
                view = this.f51479A;
            }
            if (view != null) {
                if (z3) {
                    i4 = 2;
                }
                m70438o(m70445h2, view, z2 | i4, 3);
            }
        }
        ListView listView2 = this.f51504g;
        if (listView2 != null && (listAdapter = this.f51486H) != null) {
            listView2.setAdapter(listAdapter);
            int i5 = this.f51487I;
            if (i5 > -1) {
                listView2.setItemChecked(i5, true);
                listView2.setSelection(i5);
            }
        }
    }
}
