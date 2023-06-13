.class public Landroidx/browser/trusted/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/browser/trusted/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/browser/trusted/a$c;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Landroidx/browser/trusted/a$c;
    .locals 2

    const-string v0, "android.support.customtabs.trusted.CHANNEL_NAME"

    invoke-static {p0, v0}, Landroidx/browser/trusted/a;->a(Landroid/os/Bundle;Ljava/lang/String;)V

    new-instance v1, Landroidx/browser/trusted/a$c;

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Landroidx/browser/trusted/a$c;-><init>(Ljava/lang/String;)V

    return-object v1
.end method
