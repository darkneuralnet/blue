package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.Card;
import com.braze.p028ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001CB-\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190,\u0012\u0006\u00102\u001a\u000200¢\u0006\u0004\bA\u0010BJ \u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0014\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0006\u0010\u001c\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0006J\u0012\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u0006H\u0007J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0006H\u0007J\u0012\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0007R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u000208078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R0\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00182\f\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006D"}, m28432d2 = {"LaA0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "LbA0;", "LRf2;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "kotlin.jvm.PlatformType", "B", "viewHolder", "position", "", "A", "getItemViewType", "getItemCount", "l", "", "e", "holder", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "", "getItemId", "", "Lcom/appboy/models/cards/Card;", "newCardData", "F", "x", "adapterPosition", "v", "index", "r", "u", "card", "w", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/recyclerview/widget/LinearLayoutManager;", "c", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "cardData", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "contentCardsViewBindingHandler", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "", "", "g", "Ljava/util/Set;", "impressedCardIdsInternal", "impressedCardIds", "t", "()Ljava/util/List;", "H", "(Ljava/util/List;)V", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: aA0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37797aA0 extends RecyclerView.AbstractC11843h<C38390bA0> implements InterfaceC35638Rf2 {

    /* renamed from: b */
    public final Context f50012b;

    /* renamed from: c */
    public final LinearLayoutManager f50013c;

    /* renamed from: d */
    public final List<Card> f50014d;

    /* renamed from: e */
    public final IContentCardsViewBindingHandler f50015e;

    /* renamed from: f */
    public final Handler f50016f;

    /* renamed from: g */
    public Set<String> f50017g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LaA0$a;", "Landroidx/recyclerview/widget/h$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", C17296a.f69688o, "", "Lcom/appboy/models/cards/Card;", "Ljava/util/List;", "oldCards", "b", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: aA0$a */
    /* loaded from: classes5.dex */
    public static final class C10590a extends C11905h.AbstractC11907b {

        /* renamed from: a */
        public final List<Card> f50018a;

        /* renamed from: b */
        public final List<Card> f50019b;

        /* JADX WARN: Multi-variable type inference failed */
        public C10590a(List<? extends Card> oldCards, List<? extends Card> newCards) {
            Intrinsics.checkNotNullParameter(oldCards, "oldCards");
            Intrinsics.checkNotNullParameter(newCards, "newCards");
            this.f50018a = oldCards;
            this.f50019b = newCards;
        }

        /* renamed from: a */
        public final boolean m71809a(int i, int i2) {
            return Intrinsics.areEqual(this.f50018a.get(i).getId(), this.f50019b.get(i2).getId());
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areContentsTheSame(int i, int i2) {
            return m71809a(i, i2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areItemsTheSame(int i, int i2) {
            return m71809a(i, i2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getNewListSize() {
            return this.f50019b.size();
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getOldListSize() {
            return this.f50018a.size();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$b */
    /* loaded from: classes5.dex */
    public static final class C10591b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f50020g;

        /* renamed from: h */
        public final /* synthetic */ C37797aA0 f50021h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10591b(int i, C37797aA0 c37797aA0) {
            super(0);
            this.f50020g = i;
            this.f50021h = c37797aA0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot return card at index: " + this.f50020g + " in cards list of size: " + this.f50021h.f50014d.size();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$c */
    /* loaded from: classes5.dex */
    public static final class C10592c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Card f50022g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10592c(Card card) {
            super(0);
            this.f50022g = card;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Logged impression for card ", this.f50022g.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$d */
    /* loaded from: classes5.dex */
    public static final class C10593d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Card f50023g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10593d(Card card) {
            super(0);
            this.f50023g = card;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Already counted impression for card ", this.f50023g.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$e */
    /* loaded from: classes5.dex */
    public static final class C10594e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C10594e f50024g = new C10594e();

        public C10594e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Card list is empty. Not marking on-screen cards as read.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$f */
    /* loaded from: classes5.dex */
    public static final class C10595f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f50025g;

        /* renamed from: h */
        public final /* synthetic */ int f50026h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10595f(int i, int i2) {
            super(0);
            this.f50025g = i;
            this.f50026h = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + this.f50025g + " . Last visible: " + this.f50026h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$g */
    /* loaded from: classes5.dex */
    public static final class C10596g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f50027g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10596g(int i) {
            super(0);
            this.f50027g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The card at position " + this.f50027g + " isn't on screen or does not have a valid adapter position. Not logging impression.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aA0$h */
    /* loaded from: classes5.dex */
    public static final class C10597h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f50028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10597h(int i) {
            super(0);
            this.f50028g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The card at position " + this.f50028g + " isn't on screen or does not have a valid adapter position. Not marking as read.";
        }
    }

    public C37797aA0(Context context, LinearLayoutManager layoutManager, List<Card> cardData, IContentCardsViewBindingHandler contentCardsViewBindingHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        Intrinsics.checkNotNullParameter(contentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.f50012b = context;
        this.f50013c = layoutManager;
        this.f50014d = cardData;
        this.f50015e = contentCardsViewBindingHandler;
        this.f50016f = new Handler(Looper.getMainLooper());
        this.f50017g = new LinkedHashSet();
        setHasStableIds(true);
    }

    /* renamed from: E */
    public static final void m71824E(C37797aA0 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemChanged(i);
    }

    /* renamed from: y */
    public static final void m71810y(int i, int i2, C37797aA0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: A */
    public void onBindViewHolder(C38390bA0 viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f50015e.mo53206h0(this.f50012b, this.f50014d, viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: B */
    public C38390bA0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return this.f50015e.mo53207K0(this.f50012b, this.f50014d, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: C */
    public void onViewAttachedToWindow(C38390bA0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.f50014d.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && m71814u(bindingAdapterPosition)) {
            m71812w(m71816r(bindingAdapterPosition));
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C10596g(bindingAdapterPosition), 6, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: D */
    public void onViewDetachedFromWindow(C38390bA0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (this.f50014d.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && m71814u(bindingAdapterPosition)) {
            Card m71816r = m71816r(bindingAdapterPosition);
            if (m71816r != null && !m71816r.isIndicatorHighlighted()) {
                m71816r.setIndicatorHighlighted(true);
                this.f50016f.post(new Runnable() { // from class: Yz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C37797aA0.m71824E(C37797aA0.this, bindingAdapterPosition);
                    }
                });
                return;
            }
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C10597h(bindingAdapterPosition), 6, null);
    }

    /* renamed from: F */
    public final synchronized void m71823F(List<? extends Card> newCardData) {
        Intrinsics.checkNotNullParameter(newCardData, "newCardData");
        C11905h.C11910e m66274b = C11905h.m66274b(new C10590a(this.f50014d, newCardData));
        Intrinsics.checkNotNullExpressionValue(m66274b, "calculateDiff(diffCallback)");
        this.f50014d.clear();
        this.f50014d.addAll(newCardData);
        m66274b.m66261d(this);
    }

    /* renamed from: H */
    public final void m71822H(List<String> impressedCardIds) {
        Set<String> mutableSet;
        Intrinsics.checkNotNullParameter(impressedCardIds, "impressedCardIds");
        mutableSet = CollectionsKt___CollectionsKt.toMutableSet(impressedCardIds);
        this.f50017g = mutableSet;
    }

    @Override // p000.InterfaceC35638Rf2
    /* renamed from: e */
    public boolean mo71821e(int i) {
        if (this.f50014d.isEmpty()) {
            return false;
        }
        return this.f50014d.get(i).isDismissibleByUser();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f50014d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        String id;
        Card m71816r = m71816r(i);
        if (m71816r == null || (id = m71816r.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f50015e.mo53205u2(this.f50012b, this.f50014d, i);
    }

    @Override // p000.InterfaceC35638Rf2
    /* renamed from: l */
    public void mo71820l(int i) {
        Card remove = this.f50014d.remove(i);
        remove.setDismissed(true);
        notifyItemRemoved(i);
        InterfaceC44464lO1 m75850b = Y10.f44439b.m75848a().m75850b();
        if (m75850b != null) {
            m75850b.m27348a(this.f50012b, remove);
        }
    }

    /* renamed from: r */
    public final Card m71816r(int i) {
        if (i >= 0 && i < this.f50014d.size()) {
            return this.f50014d.get(i);
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C10591b(i, this), 7, null);
        return null;
    }

    /* renamed from: t */
    public final List<String> m71815t() {
        List<String> list;
        list = CollectionsKt___CollectionsKt.toList(this.f50017g);
        return list;
    }

    /* renamed from: u */
    public final boolean m71814u(int i) {
        int min = Math.min(this.f50013c.m66707r2(), this.f50013c.m66711n2());
        int max = Math.max(this.f50013c.m66704u2(), this.f50013c.m66706s2());
        if (min > i || i > max) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m71813v(int i) {
        Card m71816r = m71816r(i);
        if (m71816r != null && m71816r.isControl()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void m71812w(Card card) {
        if (card == null) {
            return;
        }
        if (!this.f50017g.contains(card.getId())) {
            card.logImpression();
            this.f50017g.add(card.getId());
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C10592c(card), 6, null);
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C10593d(card), 6, null);
        }
        if (!card.getViewed()) {
            card.setViewed(true);
        }
    }

    /* renamed from: x */
    public final void m71811x() {
        if (this.f50014d.isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C10594e.f50024g, 7, null);
            return;
        }
        final int m66707r2 = this.f50013c.m66707r2();
        final int m66704u2 = this.f50013c.m66704u2();
        if (m66707r2 >= 0 && m66704u2 >= 0) {
            if (m66707r2 <= m66704u2) {
                int i = m66707r2;
                while (true) {
                    int i2 = i + 1;
                    Card m71816r = m71816r(i);
                    if (m71816r != null) {
                        m71816r.setIndicatorHighlighted(true);
                    }
                    if (i == m66704u2) {
                        break;
                    }
                    i = i2;
                }
            }
            this.f50016f.post(new Runnable() { // from class: Zz0
                @Override // java.lang.Runnable
                public final void run() {
                    C37797aA0.m71810y(m66704u2, m66707r2, this);
                }
            });
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C10595f(m66707r2, m66704u2), 7, null);
    }
}
