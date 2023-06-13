.class public final LZ11$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ11;
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
        "LZ11$b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LZ11$a;)V
    .locals 0

    invoke-direct {p0}, LZ11$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZ11$b;LZ11$b;)I
    .locals 0

    invoke-virtual {p1}, LZ11$b;->c()I

    move-result p1

    invoke-virtual {p2}, LZ11$b;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LZ11$b;

    check-cast p2, LZ11$b;

    invoke-virtual {p0, p1, p2}, LZ11$c;->a(LZ11$b;LZ11$b;)I

    move-result p1

    return p1
.end method
