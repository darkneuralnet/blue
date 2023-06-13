package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.BrazeInternal;
import com.appboy.events.IEventSubscriber;
import com.braze.p028ui.inappmessage.views.InAppMessageHtmlBaseView;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"StaticFieldLeak"})
/* renamed from: i20  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42478i20 extends C51084wZ1 {

    /* renamed from: G */
    public static final String f86293G = C43664k20.m29433n(C42478i20.class);

    /* renamed from: H */
    public static volatile C42478i20 f86294H = null;

    /* renamed from: A */
    public IEventSubscriber<C40585eq5> f86295A;

    /* renamed from: B */
    public Integer f86296B;

    /* renamed from: C */
    public X10 f86297C;

    /* renamed from: D */
    public HO1 f86298D;

    /* renamed from: E */
    public InterfaceC50985wO1 f86299E;

    /* renamed from: F */
    public InterfaceC50985wO1 f86300F;

    /* renamed from: v */
    public final GO1 f86301v = new GX0();

    /* renamed from: w */
    public final AtomicBoolean f86302w = new AtomicBoolean(false);

    /* renamed from: x */
    public final Stack<InterfaceC50985wO1> f86303x = new Stack<>();

    /* renamed from: y */
    public final Map<InterfaceC50985wO1, C44563lZ1> f86304y = new HashMap();

    /* renamed from: z */
    public IEventSubscriber<C44563lZ1> f86305z;

    /* renamed from: i20$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C22864a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86306a;

        static {
            int[] iArr = new int[AZ1.values().length];
            f86306a = iArr;
            try {
                iArr[AZ1.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86306a[AZ1.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86306a[AZ1.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: s */
    public static C42478i20 m35358s() {
        if (f86294H == null) {
            synchronized (C42478i20.class) {
                if (f86294H == null) {
                    f86294H = new C42478i20();
                }
            }
        }
        return f86294H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m35356u(C44563lZ1 c44563lZ1) {
        InterfaceC50985wO1 m27153a = c44563lZ1.m27153a();
        this.f86304y.put(m27153a, c44563lZ1);
        m35362o(m27153a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m35355v() {
        try {
            if (this.f86298D != null && this.f116159c != null) {
                C43664k20.m29438i(f86293G, "Page has finished loading. Opening in-app message view wrapper.");
                this.f86298D.mo95210c(this.f116159c);
            }
        } catch (Exception e) {
            C43664k20.m29434m(f86293G, "Failed to open view wrapper in page finished listener", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m35354w(C40585eq5 c40585eq5) {
        this.f86303x.clear();
        this.f86299E = null;
        this.f86300F = null;
    }

    /* renamed from: A */
    public void m35367A(Activity activity) {
        if (activity == null) {
            C43664k20.m29421z(f86293G, "Null Activity passed to unregisterInAppMessageManager.");
        } else {
            String str = f86293G;
            C43664k20.m29424w(str, "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName());
        }
        HO1 ho1 = this.f86298D;
        if (ho1 != null) {
            View mo95212a = ho1.mo95212a();
            if (mo95212a instanceof InAppMessageHtmlBaseView) {
                C43664k20.m29438i(f86293G, "In-app message view includes HTML. Removing the page finished listener.");
                ((InAppMessageHtmlBaseView) mo95212a).setHtmlPageFinishedListener(null);
            }
            C36938Wt6.m77734j(mo95212a);
            if (this.f86298D.mo95209d()) {
                this.f86301v.mo105040c(this.f86298D.mo95211b());
                this.f86299E = null;
            } else {
                this.f86299E = this.f86298D.mo95211b();
            }
            this.f86298D = null;
        } else {
            this.f86299E = null;
        }
        this.f116159c = null;
        this.f86302w.set(false);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: B */
    public boolean m35366B(InterfaceC50985wO1 interfaceC50985wO1) {
        Activity activity = this.f116159c;
        if (activity == null) {
            C43664k20.m29421z(f86293G, "Cannot verify orientation status with null Activity.");
            return true;
        } else if (C36938Wt6.m77735i(activity)) {
            C43664k20.m29438i(f86293G, "Running on tablet. In-app message can be displayed in any orientation.");
            return true;
        } else {
            EnumC32300Cy3 mo6952F = interfaceC50985wO1.mo6952F();
            if (mo6952F == null) {
                C43664k20.m29438i(f86293G, "No orientation specified. In-app message can be displayed in any orientation.");
                return true;
            } else if (mo6952F == EnumC32300Cy3.ANY) {
                C43664k20.m29438i(f86293G, "Any orientation specified. In-app message can be displayed in any orientation.");
                return true;
            } else if (C36938Wt6.m77738f(this.f116159c.getResources().getConfiguration().orientation, mo6952F)) {
                if (this.f86296B == null) {
                    C43664k20.m29438i(f86293G, "Requesting orientation lock.");
                    this.f86296B = Integer.valueOf(this.f116159c.getRequestedOrientation());
                    C36938Wt6.m77733k(this.f116159c, 14);
                }
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: o */
    public void m35362o(InterfaceC50985wO1 interfaceC50985wO1) {
        this.f86303x.push(interfaceC50985wO1);
        m35352y();
    }

    /* renamed from: p */
    public final IEventSubscriber<C44563lZ1> m35361p() {
        return new IEventSubscriber() { // from class: h20
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C42478i20.this.m35356u((C44563lZ1) obj);
            }
        };
    }

    /* renamed from: q */
    public void m35360q(InterfaceC50985wO1 interfaceC50985wO1, boolean z) {
        String str = f86293G;
        C43664k20.m29424w(str, "Attempting to display in-app message with payload: " + C31696Aj2.m115350i(interfaceC50985wO1.forJsonPut()));
        if (!this.f86302w.compareAndSet(false, true)) {
            C43664k20.m29438i(str, "A in-app message is currently being displayed. Adding in-app message back on the stack.");
            this.f86303x.push(interfaceC50985wO1);
            return;
        }
        try {
            if (this.f116159c != null) {
                if (!z) {
                    long mo6936o0 = interfaceC50985wO1.mo6936o0();
                    if (mo6936o0 > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > mo6936o0) {
                            throw new Exception("In-app message is expired. Doing nothing. Expiration: $" + mo6936o0 + ". Current time: " + currentTimeMillis);
                        }
                    } else {
                        C43664k20.m29438i(str, "Expiration timestamp not defined. Continuing.");
                    }
                } else {
                    C43664k20.m29438i(str, "Not checking expiration status for carry-over in-app message.");
                }
                if (m35366B(interfaceC50985wO1)) {
                    if (interfaceC50985wO1.isControl()) {
                        C43664k20.m29438i(str, "Not displaying control in-app message. Logging impression and ending display execution.");
                        interfaceC50985wO1.logImpression();
                        m35351z();
                        return;
                    } else if (S10.m86124a(interfaceC50985wO1) && !C39750dR3.m44271e(this.f116159c)) {
                        C44563lZ1 c44563lZ1 = this.f86304y.get(interfaceC50985wO1);
                        C43664k20.m29431p(str, "Cannot show message containing a Braze Actions Push Prompt due to existing push prompt status.");
                        if (c44563lZ1 != null) {
                            C43664k20.m29431p(str, "Will attempt to perform any fallback actions.");
                            BrazeInternal.retryInAppMessage(this.f116159c.getApplicationContext(), c44563lZ1);
                        }
                        m35351z();
                        return;
                    } else {
                        FO1 m6650j = m6650j(interfaceC50985wO1);
                        if (m6650j != null) {
                            View mo1260a = m6650j.mo1260a(this.f116159c, interfaceC50985wO1);
                            if (mo1260a != null) {
                                if (mo1260a.getParent() == null) {
                                    Animation mo5071a = m6652h().mo5071a(interfaceC50985wO1);
                                    Animation mo5070b = m6652h().mo5070b(interfaceC50985wO1);
                                    IO1 m6649k = m6649k();
                                    if (mo1260a instanceof BO1) {
                                        C43664k20.m29438i(str, "Creating view wrapper for immersive in-app message.");
                                        BO1 bo1 = (BO1) mo1260a;
                                        this.f86298D = m6649k.mo93809b(mo1260a, interfaceC50985wO1, this.f86301v, this.f86297C, mo5071a, mo5070b, bo1.getMessageClickableView(), bo1.getMessageButtonViews(((AbstractC48713sZ1) interfaceC50985wO1).mo14016M().size()), bo1.getMessageCloseButtonView());
                                    } else if (mo1260a instanceof EO1) {
                                        C43664k20.m29438i(str, "Creating view wrapper for base in-app message.");
                                        this.f86298D = m6649k.mo93810a(mo1260a, interfaceC50985wO1, this.f86301v, this.f86297C, mo5071a, mo5070b, ((EO1) mo1260a).getMessageClickableView());
                                    } else {
                                        C43664k20.m29438i(str, "Creating view wrapper for in-app message.");
                                        this.f86298D = m6649k.mo93810a(mo1260a, interfaceC50985wO1, this.f86301v, this.f86297C, mo5071a, mo5070b, mo1260a);
                                    }
                                    if (mo1260a instanceof InAppMessageHtmlBaseView) {
                                        C43664k20.m29438i(str, "In-app message view includes HTML. Delaying display until the content has finished loading.");
                                        ((InAppMessageHtmlBaseView) mo1260a).setHtmlPageFinishedListener(new InterfaceC46845pP1() { // from class: g20
                                            @Override // p000.InterfaceC46845pP1
                                            /* renamed from: a */
                                            public final void mo19348a() {
                                                C42478i20.this.m35355v();
                                            }
                                        });
                                        return;
                                    }
                                    this.f86298D.mo95210c(this.f116159c);
                                    return;
                                }
                                interfaceC50985wO1.mo6945T(EnumC45156mZ1.DISPLAY_VIEW_GENERATION);
                                throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                            }
                            interfaceC50985wO1.mo6945T(EnumC45156mZ1.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                        interfaceC50985wO1.mo6945T(EnumC45156mZ1.DISPLAY_VIEW_GENERATION);
                        throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                    }
                }
                throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
            }
            this.f86299E = interfaceC50985wO1;
            throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
        } catch (Throwable th) {
            String str2 = f86293G;
            C43664k20.m29434m(str2, "Could not display in-app message with payload: " + C31696Aj2.m115350i(interfaceC50985wO1.forJsonPut()), th);
            m35351z();
        }
    }

    /* renamed from: r */
    public void m35359r(Context context) {
        if (this.f86305z != null) {
            C43664k20.m29438i(f86293G, "Removing existing in-app message event subscriber before subscribing a new one.");
            P10.getInstance(context).removeSingleSubscription(this.f86305z, C44563lZ1.class);
        }
        String str = f86293G;
        C43664k20.m29438i(str, "Subscribing in-app message event subscriber");
        this.f86305z = m35361p();
        P10.getInstance(context).subscribeToNewInAppMessages(this.f86305z);
        if (this.f86295A != null) {
            C43664k20.m29424w(str, "Removing existing sdk data wipe event subscriber before subscribing a new one.");
            P10.getInstance(context).removeSingleSubscription(this.f86295A, C40585eq5.class);
        }
        C43664k20.m29424w(str, "Subscribing sdk data wipe subscriber");
        this.f86295A = new IEventSubscriber() { // from class: f20
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C42478i20.this.m35354w((C40585eq5) obj);
            }
        };
        P10.getInstance(context).addSingleSynchronousSubscription(this.f86295A, C40585eq5.class);
    }

    /* renamed from: t */
    public void m35357t(boolean z) {
        HO1 ho1 = this.f86298D;
        if (ho1 != null) {
            if (z) {
                this.f86301v.mo105038e(ho1.mo95212a(), ho1.mo95211b());
            }
            ho1.close();
        }
    }

    /* renamed from: x */
    public void m35353x(Activity activity) {
        if (activity == null) {
            C43664k20.m29421z(f86293G, "Null Activity passed to registerInAppMessageManager. Doing nothing");
            return;
        }
        String str = f86293G;
        C43664k20.m29424w(str, "Registering InAppMessageManager with activity: " + activity.getLocalClassName());
        this.f116159c = activity;
        if (this.f116160d == null) {
            this.f116160d = activity.getApplicationContext();
        }
        if (this.f86297C == null) {
            this.f86297C = new X10(this.f116160d);
        }
        if (this.f86299E != null) {
            C43664k20.m29438i(str, "Requesting display of carryover in-app message.");
            this.f86299E.mo6939j0(false);
            m35360q(this.f86299E, true);
            this.f86299E = null;
        } else if (this.f86300F != null) {
            C43664k20.m29438i(str, "Adding previously unregistered in-app message.");
            m35362o(this.f86300F);
            this.f86300F = null;
        }
        m35359r(this.f116160d);
    }

    /* renamed from: y */
    public boolean m35352y() {
        AZ1 mo112176h;
        try {
            if (this.f116159c == null) {
                if (!this.f86303x.empty()) {
                    C43664k20.m29421z(f86293G, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
                    this.f86300F = this.f86303x.pop();
                } else {
                    C43664k20.m29438i(f86293G, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.");
                }
                return false;
            } else if (this.f86302w.get()) {
                C43664k20.m29438i(f86293G, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
                return false;
            } else if (this.f86303x.isEmpty()) {
                C43664k20.m29438i(f86293G, "The in-app message stack is empty. No in-app message will be displayed.");
                return false;
            } else {
                InterfaceC50985wO1 pop = this.f86303x.pop();
                if (!pop.isControl()) {
                    mo112176h = m6651i().mo112176h(pop);
                } else {
                    C43664k20.m29438i(f86293G, "Using the control in-app message manager listener.");
                    mo112176h = m6657c().mo112176h(pop);
                }
                int i = C22864a.f86306a[mo112176h.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C43664k20.m29421z(f86293G, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
                            return false;
                        }
                        C43664k20.m29438i(f86293G, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
                        return false;
                    }
                    C43664k20.m29438i(f86293G, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
                    this.f86303x.push(pop);
                    return false;
                }
                C43664k20.m29438i(f86293G, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
                C12202aw.m65241g(pop);
                return true;
            }
        } catch (Exception e) {
            C43664k20.m29434m(f86293G, "Error running requestDisplayInAppMessage", e);
            return false;
        }
    }

    /* renamed from: z */
    public void m35351z() {
        String str = f86293G;
        C43664k20.m29424w(str, "Resetting after in-app message close.");
        this.f86298D = null;
        this.f86302w.set(false);
        if (this.f116159c != null && this.f86296B != null) {
            C43664k20.m29438i(str, "Setting requested orientation to original orientation " + this.f86296B);
            C36938Wt6.m77733k(this.f116159c, this.f86296B.intValue());
            this.f86296B = null;
        }
    }
}
