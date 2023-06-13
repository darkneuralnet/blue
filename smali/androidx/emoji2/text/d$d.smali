.class public Landroidx/emoji2/text/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/emoji2/text/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/emoji2/text/d$c<",
        "Landroidx/emoji2/text/d$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/emoji2/text/d$d;->b:I

    iput v0, p0, Landroidx/emoji2/text/d$d;->c:I

    iput p1, p0, Landroidx/emoji2/text/d$d;->a:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/d$d;->c()Landroidx/emoji2/text/d$d;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/CharSequence;IILxc6;)Z
    .locals 0

    iget p1, p0, Landroidx/emoji2/text/d$d;->a:I

    const/4 p4, 0x0

    if-gt p2, p1, :cond_0

    if-ge p1, p3, :cond_0

    iput p2, p0, Landroidx/emoji2/text/d$d;->b:I

    iput p3, p0, Landroidx/emoji2/text/d$d;->c:I

    return p4

    :cond_0
    if-gt p3, p1, :cond_1

    const/4 p4, 0x1

    :cond_1
    return p4
.end method

.method public c()Landroidx/emoji2/text/d$d;
    .locals 0

    return-object p0
.end method
