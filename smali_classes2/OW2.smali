.class public final LOW2;
.super LxE;
.source "SourceFile"

# interfaces
.implements LKW2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016R\"\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u001c"
    }
    d2 = {
        "LOW2;",
        "LxE;",
        "LKW2;",
        "",
        "LGk6;",
        "vehicles",
        "",
        "m1",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "N4",
        "Lio/reactivex/subjects/d;",
        "Lco/bird/android/model/VehicleClass;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lio/reactivex/subjects/d;",
        "classSubject",
        "Landroid/view/View;",
        "c",
        "Landroid/view/View;",
        "moped",
        "d",
        "scooter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "contentView",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V",
        "app_birdRelease"
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
        "SMAP\nMultiModalRiderTutorialSelectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiModalRiderTutorialSelectionUi.kt\nco/bird/android/app/feature/ridertutorial/ui/MultiModalRiderTutorialSelectionUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,67:1\n180#2:68\n180#2:69\n*S KotlinDebug\n*F\n+ 1 MultiModalRiderTutorialSelectionUi.kt\nco/bird/android/app/feature/ridertutorial/ui/MultiModalRiderTutorialSelectionUiImpl\n*L\n36#1:68\n40#1:69\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/VehicleClass;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V
    .locals 7

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<VehicleClass>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LOW2;->b:Lio/reactivex/subjects/d;

    sget v0, LVg4;->multiModalTutorialSelectionMopedImage:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, LOW2;->c:Landroid/view/View;

    sget v0, LVg4;->multiModalTutorialSelectionScooterImage:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, LOW2;->d:Landroid/view/View;

    iget-object p2, p0, LOW2;->c:Landroid/view/View;

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {p2, v4}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    const-string v4, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, LOW2$a;

    invoke-direct {v5, p0}, LOW2$a;-><init>(LOW2;)V

    new-instance v6, LLW2;

    invoke-direct {v6, v5}, LLW2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object p2, p0, LOW2;->d:Landroid/view/View;

    invoke-static {p2, v0, v1, v2, v3}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, LOW2$b;

    invoke-direct {p2, p0}, LOW2$b;-><init>(LOW2;)V

    new-instance v0, LMW2;

    invoke-direct {v0, p2}, LMW2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    const-string p3, "activity.window.decorView"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, LOW2;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Pl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 0

    invoke-static {p0, p1}, LOW2;->Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOW2;->_init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Rl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOW2;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/ridertutorial/TutorialKind;

    return-object p0
.end method

.method public static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final _init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getClassSubject$p(LOW2;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LOW2;->b:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public N4()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/ridertutorial/TutorialKind;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOW2;->b:Lio/reactivex/subjects/d;

    sget-object v1, LOW2$c;->g:LOW2$c;

    new-instance v2, LNW2;

    invoke-direct {v2, v1}, LNW2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "classSubject.map {\n     \u2026ASS_SCOOTER\n      }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public m1(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LGk6;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
