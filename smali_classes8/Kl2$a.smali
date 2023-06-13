.class public LKl2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKl2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LKl2$a;->a:I

    return-void
.end method

.method public static synthetic a(LKl2$a;)I
    .locals 0

    iget p0, p0, LKl2$a;->a:I

    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LKl2$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LKl2$a;

    iget p1, p1, LKl2$a;->a:I

    iget v0, p0, LKl2$a;->a:I

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LKl2$a;->a:I

    return v0
.end method
