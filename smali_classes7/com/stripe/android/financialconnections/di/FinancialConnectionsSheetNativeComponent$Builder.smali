.class public interface abstract Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u00020\u00002\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH\'\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;",
        "",
        "application",
        "Landroid/app/Application;",
        "build",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "initialState",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "initialSyncResponse",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
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


# virtual methods
.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;
.end method

.method public abstract configuration(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract initialState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract initialSyncResponse(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
