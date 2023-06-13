.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;",
        ">;"
    }
.end annotation


# instance fields
.field private final subcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;->subcomponentBuilderProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;-><init>(LY94;)V

    return-object v0
.end method

.method public static injectSubcomponentBuilderProvider(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;->subcomponentBuilderProvider:LY94;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;->subcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;->injectSubcomponentBuilderProvider(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;LY94;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;->injectMembers(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;)V

    return-void
.end method
