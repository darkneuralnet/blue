.class public final Lrm0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrm0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lrm0$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrm0$b;Lrm0$b;)I
    .locals 0

    invoke-virtual {p2}, Lrm0$b;->g()I

    move-result p2

    invoke-virtual {p1}, Lrm0$b;->g()I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lrm0$b;

    check-cast p2, Lrm0$b;

    invoke-virtual {p0, p1, p2}, Lrm0$a;->a(Lrm0$b;Lrm0$b;)I

    move-result p1

    return p1
.end method
