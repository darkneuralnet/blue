.class public final Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;)V",
        "getRepository",
        "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "invoke",
        "",
        "block",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    return-void
.end method


# virtual methods
.method public final getRepository()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    return-object v0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    invoke-interface {v0, p1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->updateLocalManifest(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
