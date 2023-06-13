.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0010\t\u001a\u00028\u0001\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0010\u0008\u0001\u0010\u0003\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00020\u0002\"\n\u0008\u0002\u0010\u0005\u0018\u0001*\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/activity/ComponentActivity;",
        "T",
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "invoke",
        "()LRN2;",
        "com/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMavericksExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2\n+ 2 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$1\n*L\n1#1,56:1\n28#2:57\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_viewModelLazy:Landroidx/activity/ComponentActivity;

.field final synthetic $viewModelClass:Lkotlin/reflect/KClass;

.field final synthetic $viewModelClass$inlined:Lkotlin/reflect/KClass;


# direct methods
.method public constructor <init>(Lkotlin/reflect/KClass;Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->$viewModelClass:Lkotlin/reflect/KClass;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->$this_viewModelLazy:Landroidx/activity/ComponentActivity;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->$viewModelClass$inlined:Lkotlin/reflect/KClass;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LRN2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;"
        }
    .end annotation

    sget-object v0, LYN2;->a:LYN2;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->$viewModelClass:Lkotlin/reflect/KClass;

    invoke-static {v1}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    new-instance v10, Lr6;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->$this_viewModelLazy:Landroidx/activity/ComponentActivity;

    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v5, "mavericks:arg"

    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    move-object v5, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->$viewModelClass$inlined:Lkotlin/reflect/KClass;

    invoke-static {v3}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v3, "viewModelClass.java.name"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v7, 0x30

    const/4 v8, 0x0

    move-object v3, v10

    invoke-static/range {v0 .. v8}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;->invoke()LRN2;

    move-result-object v0

    return-object v0
.end method
