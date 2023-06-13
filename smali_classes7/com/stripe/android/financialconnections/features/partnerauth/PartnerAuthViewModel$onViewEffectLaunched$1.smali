.class final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onViewEffectLaunched()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;
    .locals 7

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;->invoke(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    move-result-object p1

    return-object p1
.end method
