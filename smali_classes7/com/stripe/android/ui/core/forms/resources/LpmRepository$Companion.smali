.class public final Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;",
        "",
        "()V",
        "HardcodedCard",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "getHardcodedCard",
        "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "INSTANCE",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "getInstance",
        "args",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLpmRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmRepository.kt\ncom/stripe/android/ui/core/forms/resources/LpmRepository$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,561:1\n1#2:562\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getHardcodedCard()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->access$getHardcodedCard$cp()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v0

    return-object v0
.end method

.method public final getInstance(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
    .locals 7

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->access$getINSTANCE$cp()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->access$getINSTANCE$cp()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;-><init>(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->access$setINSTANCE$cp(Lcom/stripe/android/ui/core/forms/resources/LpmRepository;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method
