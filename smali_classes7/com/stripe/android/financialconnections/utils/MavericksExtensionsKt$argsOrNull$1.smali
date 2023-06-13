.class public final Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/properties/ReadOnlyProperty;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->argsOrNull()Lkotlin/properties/ReadOnlyProperty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/properties/ReadOnlyProperty<",
        "Landroidx/activity/ComponentActivity;",
        "TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J$\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\u0011H\u0096\u0002\u00a2\u0006\u0002\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "com/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1",
        "Lkotlin/properties/ReadOnlyProperty;",
        "Landroidx/activity/ComponentActivity;",
        "read",
        "",
        "getRead",
        "()Z",
        "setRead",
        "(Z)V",
        "value",
        "getValue",
        "()Ljava/lang/Object;",
        "setValue",
        "(Ljava/lang/Object;)V",
        "Ljava/lang/Object;",
        "thisRef",
        "property",
        "Lkotlin/reflect/KProperty;",
        "(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KProperty;)Ljava/lang/Object;",
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
.field private read:Z

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRead()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->read:Z

    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KProperty;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/ComponentActivity;",
            "Lkotlin/reflect/KProperty<",
            "*>;)TV;"
        }
    .end annotation

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->read:Z

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const-string v0, "mavericks:arg"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    iput-object p2, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->value:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->read:Z

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->value:Ljava/lang/Object;

    return-object p1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/activity/ComponentActivity;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->getValue(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setRead(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->read:Z

    return-void
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;->value:Ljava/lang/Object;

    return-void
.end method
