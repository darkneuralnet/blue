.class final synthetic Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;
.super Lkotlin/jvm/internal/PropertyReference1Impl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->observeAsyncs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-string v0, "getPayload()Lcom/airbnb/mvrx/Async;"

    const/4 v1, 0x0

    const-class v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    const-string v3, "payload"

    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getPayload()Ldp;

    move-result-object p1

    return-object p1
.end method
