.class public final Lnm1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Comparator<",
        "Llm1;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnm1$c;->b:F

    return-void
.end method

.method public synthetic constructor <init>(FLnm1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lnm1$c;-><init>(F)V

    return-void
.end method


# virtual methods
.method public a(Llm1;Llm1;)I
    .locals 1

    invoke-virtual {p2}, Llm1;->i()F

    move-result p2

    iget v0, p0, Lnm1$c;->b:F

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-virtual {p1}, Llm1;->i()F

    move-result p1

    iget v0, p0, Lnm1$c;->b:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Llm1;

    check-cast p2, Llm1;

    invoke-virtual {p0, p1, p2}, Lnm1$c;->a(Llm1;Llm1;)I

    move-result p1

    return p1
.end method
