.class public final Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LIa4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$a;,
        Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001MB\u0007\u00a2\u0006\u0004\u0008J\u0010KJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0012H\u0003R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\"\u0010$\u001a\u0010\u0012\u000c\u0012\n !*\u0004\u0018\u00010 0 0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\"\u0010\'\u001a\u0010\u0012\u000c\u0012\n !*\u0004\u0018\u00010%0%0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010#R:\u0010*\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012 !*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010(0(0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010#R\u001a\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00080+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00080\u00101R!\u00109\u001a\u0008\u0012\u0004\u0012\u000204038VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R!\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u0005038VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u00106\u001a\u0004\u0008;\u00108R!\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u0005038VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u00106\u001a\u0004\u0008>\u00108R \u0010C\u001a\u0008\u0012\u0004\u0012\u00020 038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u00108R \u0010F\u001a\u0008\u0012\u0004\u0012\u00020%038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008D\u0010A\u001a\u0004\u0008E\u00108R,\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120(038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008G\u0010A\u001a\u0004\u0008H\u00108\u00a8\u0006N"
    }
    d2 = {
        "Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LIa4;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "LKa4;",
        "state",
        "S",
        "",
        "",
        "methods",
        "P",
        "key",
        "Q",
        "LEa4;",
        "j",
        "LEa4;",
        "R",
        "()LEa4;",
        "setPresenter",
        "(LEa4;)V",
        "presenter",
        "Lio/reactivex/subjects/d;",
        "",
        "kotlin.jvm.PlatformType",
        "k",
        "Lio/reactivex/subjects/d;",
        "purchaseSubject",
        "LxD1;",
        "l",
        "googlePayResultSubject",
        "Lkotlin/Pair;",
        "m",
        "testMethodClickSubject",
        "",
        "n",
        "Ljava/util/List;",
        "customViewIds",
        "LV4;",
        "o",
        "LV4;",
        "binding",
        "Lio/reactivex/Observable;",
        "LcL3;",
        "p",
        "Lkotlin/Lazy;",
        "T8",
        "()Lio/reactivex/Observable;",
        "googlePayClicks",
        "q",
        "R8",
        "cardClicks",
        "r",
        "a9",
        "paypalClicks",
        "s",
        "Lio/reactivex/Observable;",
        "u3",
        "readyToPurchase",
        "t",
        "P0",
        "googlePayResult",
        "u",
        "G4",
        "testMethodClicks",
        "<init>",
        "()V",
        "v",
        "a",
        "purchase-payment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPurchasePaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePaymentActivity.kt\nco/bird/android/library/purchasepayment/PurchasePaymentActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,179:1\n6#2:180\n6#2:188\n1#3:181\n1#3:189\n13#4,2:182\n15#4,2:186\n13#4,2:190\n15#4,2:194\n1109#5,2:184\n1109#5,2:192\n1855#6,2:196\n215#7,2:198\n*S KotlinDebug\n*F\n+ 1 PurchasePaymentActivity.kt\nco/bird/android/library/purchasepayment/PurchasePaymentActivity\n*L\n72#1:180\n84#1:188\n72#1:181\n84#1:189\n72#1:182,2\n72#1:186,2\n84#1:190,2\n84#1:194,2\n72#1:184,2\n84#1:192,2\n127#1:196,2\n134#1:198,2\n*E\n"
    }
.end annotation


# static fields
.field public static final v:Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$a;


# instance fields
.field public j:LEa4;

.field public final k:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "LxD1;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public o:LV4;

.field public final p:Lkotlin/Lazy;

.field public final q:Lkotlin/Lazy;

.field public final r:Lkotlin/Lazy;

.field public final s:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "LxD1;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->v:Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->k:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<GooglePayResult>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->l:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v2

    const-string v3, "create<Pair<String, String>>()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->m:Lio/reactivex/subjects/d;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->n:Ljava/util/List;

    new-instance v3, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;

    invoke-direct {v3, p0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;-><init>(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v3

    iput-object v3, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->p:Lkotlin/Lazy;

    new-instance v3, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$c;

    invoke-direct {v3, p0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$c;-><init>(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v3

    iput-object v3, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->q:Lkotlin/Lazy;

    new-instance v3, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$f;

    invoke-direct {v3, p0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$f;-><init>(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v3

    iput-object v3, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->r:Lkotlin/Lazy;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v3, "purchaseSubject.hide()"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->s:Lio/reactivex/Observable;

    invoke-virtual {v1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "googlePayResultSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->t:Lio/reactivex/Observable;

    invoke-virtual {v2}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "testMethodClickSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->u:Lio/reactivex/Observable;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)LV4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    return-object p0
.end method

.method public static final synthetic access$getTestMethodClickSubject$p(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->m:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public G4()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->u:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final P(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->n:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "binding"

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v4, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v4, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v3

    :cond_1
    invoke-virtual {v4}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object v4

    const-string v5, "binding.root"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v4, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    invoke-virtual {v3}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "creating test button for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " and "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "..."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {v4, v6}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v4

    sget v6, Ldk4;->generic_payment_method_button:I

    iget-object v7, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v7, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v3

    :cond_5
    invoke-virtual {v7}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object v7

    invoke-virtual {v4, v6, v7, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Landroid/widget/Button;

    if-eqz v5, :cond_6

    check-cast v4, Landroid/widget/Button;

    goto :goto_3

    :cond_6
    move-object v4, v3

    :goto_3
    if-eqz v4, :cond_4

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setId(I)V

    iget-object v5, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->n:Ljava/util/List;

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v5, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v3

    :cond_7
    invoke-virtual {v5}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p0, v1}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->Q(Ljava/lang/String;)I

    move-result v6

    invoke-static {v5, v6}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    sget v7, Lrg4;->ic_chevron_right:I

    invoke-static {v5, v7}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v6, v3, v5, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$d;

    invoke-direct {v5, p0, v1, v0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$d;-><init>(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v0, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_8
    invoke-virtual {v0}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_2

    :cond_9
    iget-object p1, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez p1, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    move-object v3, p1

    :goto_4
    invoke-virtual {v3}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public P0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LxD1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->t:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final Q(Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "giro"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget p1, Lpg4;->ic_giro_pay_bw:I

    goto :goto_1

    :sswitch_1
    const-string v0, "sofort"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :sswitch_2
    const-string v0, "klarna"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget p1, Lpg4;->ic_klarna_bw:I

    goto :goto_1

    :sswitch_3
    const-string v0, "bancontact"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget p1, Lpg4;->ic_bancontact_bw:I

    goto :goto_1

    :goto_0
    sget p1, Lpg4;->ic_money_transfer_bw:I

    :goto_1
    return p1

    :sswitch_data_0
    .sparse-switch
        -0x727c36cf -> :sswitch_3
        -0x4349b97b -> :sswitch_2
        -0x357672d9 -> :sswitch_1
        0x306a9f -> :sswitch_0
    .end sparse-switch
.end method

.method public final R()LEa4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->j:LEa4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public R8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->q:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public S(LKa4;)V
    .locals 11

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LmY0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lco/bird/android/navigator/PurchasePaymentActivityResult;

    sget v0, Lnl4;->payment_incomplete:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(L.string.payment_incomplete)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lco/bird/android/navigator/PurchasePaymentActivityResult;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LX52;->a(Lco/bird/android/navigator/ActivityResult;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->w()Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->e3()V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lrm1;

    if-eqz v0, :cond_1

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->w()Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->e3()V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, LYa1;

    const-string v2, "binding"

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_2
    iget-object v0, v0, LV4;->c:Landroid/widget/Button;

    const-string v2, "binding.gPay"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LYa1;

    invoke-virtual {p1}, LYa1;->b()Z

    move-result p1

    invoke-static {v0, p1, v1, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, LZa1;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_4
    iget-object v0, v0, LV4;->d:Landroid/widget/Button;

    const-string v2, "binding.paypal"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LZa1;

    invoke-virtual {p1}, LZa1;->b()Z

    move-result p1

    invoke-static {v0, p1, v1, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lbb1;

    if-eqz v0, :cond_6

    check-cast p1, Lbb1;

    invoke-virtual {p1}, Lbb1;->b()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->P(Ljava/util/Map;)V

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lzt2;

    if-eqz v0, :cond_8

    check-cast p1, Lzt2;

    invoke-virtual {p1}, Lzt2;->a()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    invoke-virtual {p1}, LXC;->startProgress()V

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, v4}, LS74$a;->stopProgress$default(LS74;IILjava/lang/Object;)V

    goto :goto_0

    :cond_8
    instance-of v0, p1, LyA5;

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v1

    new-instance v2, Lm06;

    check-cast p1, LyA5;

    invoke-virtual {p1}, LyA5;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lm06;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7e

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_9
    :goto_0
    return-void
.end method

.method public T8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LcL3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-googlePayClicks>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public a9()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->r:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    if-eqz p2, :cond_3

    const/16 v0, 0x272e

    if-eq p1, v0, :cond_2

    const/16 p3, 0x272f

    if-eq p1, p3, :cond_0

    const/16 p3, 0x2736

    if-eq p1, p3, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->k:Lio/reactivex/subjects/d;

    const/4 p3, -0x1

    if-ne p2, p3, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->l:Lio/reactivex/subjects/d;

    new-instance v0, LxD1;

    invoke-direct {v0, p2, p3}, LxD1;-><init>(ILandroid/content/Intent;)V

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 17

    move-object/from16 v0, p0

    const-class v1, Lco/bird/android/model/PaymentAddSource;

    const-class v2, Lco/bird/android/model/constant/PurchasePaymentReason;

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-static {v3}, LV4;->c(Landroid/view/LayoutInflater;)LV4;

    move-result-object v3

    const-string v4, "inflate(layoutInflater)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->o:LV4;

    if-nez v3, :cond_0

    const-string v3, "binding"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_0
    invoke-virtual {v3}, LV4;->b()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v5, "intent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "purchase_payment_reason"

    invoke-virtual {v3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "{\n    E::class.java.enum\u2026.equals(name, true) }\n  }"

    const-string v7, "{\n    E::class.java.enum\u2026m.name == \"UNKNOWN\" }\n  }"

    const-string v8, "UNKNOWN"

    const-string v9, "Array contains no element matching the predicate."

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v3, :cond_5

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v13, v12

    move v14, v10

    :goto_0
    if-ge v14, v13, :cond_2

    aget-object v15, v12, v14

    move-object/from16 v16, v15

    check-cast v16, Ljava/lang/Enum;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3, v11}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Ljava/lang/Enum;

    goto :goto_2

    :cond_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_2
    new-instance v3, Ljava/util/NoSuchElementException;

    invoke-direct {v3, v9}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v3, v2

    move v4, v10

    :goto_1
    if-ge v4, v3, :cond_4

    aget-object v12, v2, v4

    move-object v15, v12

    check-cast v15, Ljava/lang/Enum;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v9}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    const/4 v15, 0x0

    :goto_2
    check-cast v15, Lco/bird/android/model/constant/PurchasePaymentReason;

    if-nez v15, :cond_6

    const/4 v2, -0x1

    goto :goto_3

    :cond_6
    sget-object v2, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    :goto_3
    if-eq v2, v11, :cond_9

    const/4 v3, 0x2

    if-eq v2, v3, :cond_8

    const/4 v3, 0x3

    if-eq v2, v3, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "activity_title_res_id"

    sget v4, Lnl4;->purchase_payment_screen_header:I

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    goto :goto_4

    :cond_7
    sget v2, Lnl4;->bird_plus_symbol_uppercased:I

    goto :goto_4

    :cond_8
    sget v2, Lnl4;->ride_pass_left_navigation_title:I

    goto :goto_4

    :cond_9
    sget v2, Lnl4;->purchase_payment_screen_header:I

    :goto_4
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setTitle(I)V

    invoke-static {}, Lco/bird/android/library/purchasepayment/a;->a()Lco/bird/android/library/purchasepayment/b$a;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "payment_add_source"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v12, v5

    move v13, v10

    :goto_5
    if-ge v13, v12, :cond_b

    aget-object v14, v5, v13

    move-object v15, v14

    check-cast v15, Ljava/lang/Enum;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v4, v11}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-static {v14, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ljava/lang/Enum;

    move-object v4, v14

    goto :goto_7

    :cond_a
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_b
    new-instance v4, Ljava/util/NoSuchElementException;

    invoke-direct {v4, v9}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v4, v1

    :goto_6
    if-ge v10, v4, :cond_d

    aget-object v5, v1, v10

    move-object v6, v5

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v6

    goto :goto_7

    :cond_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_d
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v9}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    const/4 v4, 0x0

    :goto_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v4, Lco/bird/android/model/PaymentAddSource;

    invoke-interface {v2, v3, v0, v4}, Lco/bird/android/library/purchasepayment/b$a;->a(LlG2;Landroid/app/Activity;Lco/bird/android/model/PaymentAddSource;)Lco/bird/android/library/purchasepayment/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lco/bird/android/library/purchasepayment/b;->a(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->R()LEa4;

    move-result-object v1

    invoke-virtual {v1, v0}, LEa4;->x(LIa4;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LKa4;

    invoke-virtual {p0, p1}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->S(LKa4;)V

    return-void
.end method

.method public u3()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->s:Lio/reactivex/Observable;

    return-object v0
.end method
