.class public final Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/signup/SignUpViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Debouncer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0012\u0010\u0013JF\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;",
        "",
        "LZC0;",
        "coroutineScope",
        "LtP5;",
        "",
        "emailFlow",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "",
        "onStateChanged",
        "onValidEmailEntered",
        "startWatching",
        "initialEmail",
        "Ljava/lang/String;",
        "Lzh2;",
        "lookupJob",
        "Lzh2;",
        "<init>",
        "(Ljava/lang/String;)V",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final initialEmail:Ljava/lang/String;

.field private lookupJob:Lzh2;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->initialEmail:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getInitialEmail$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->initialEmail:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLookupJob$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;)Lzh2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->lookupJob:Lzh2;

    return-object p0
.end method

.method public static final synthetic access$setLookupJob$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;Lzh2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->lookupJob:Lzh2;

    return-void
.end method


# virtual methods
.method public final startWatching(LZC0;LtP5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "LtP5<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStateChanged"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValidEmailEntered"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p2

    move-object v6, p0

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1;-><init>(LtP5;Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
