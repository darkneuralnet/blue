.class public final LmA0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmA0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LmA0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Landroid/view/ContentInfo;


# direct methods
.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LlA0;->a(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LmA0$e;->a:Landroid/view/ContentInfo;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, LmA0$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, LtA0;->a(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public getSource()I
    .locals 1

    iget-object v0, p0, LmA0$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, LvA0;->a(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, LmA0$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, LuA0;->a(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public l()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, LmA0$e;->a:Landroid/view/ContentInfo;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentInfoCompat{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LmA0$e;->a:Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
