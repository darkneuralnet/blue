.class public final LmA0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmA0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LmA0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/content/ClipData;

.field public b:I

.field public c:I

.field public d:Landroid/net/Uri;

.field public e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmA0$d;->a:Landroid/content/ClipData;

    iput p2, p0, LmA0$d;->b:I

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, LmA0$d;->d:Landroid/net/Uri;

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, LmA0$d;->c:I

    return-void
.end method

.method public build()LmA0;
    .locals 2

    new-instance v0, LmA0;

    new-instance v1, LmA0$g;

    invoke-direct {v1, p0}, LmA0$g;-><init>(LmA0$d;)V

    invoke-direct {v0, v1}, LmA0;-><init>(LmA0$f;)V

    return-object v0
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LmA0$d;->e:Landroid/os/Bundle;

    return-void
.end method
