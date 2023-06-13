.class public LLM1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLM1;->a()LCT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "LqP5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LLM1;


# direct methods
.method public constructor <init>(LLM1;)V
    .locals 0

    iput-object p1, p0, LLM1$a;->b:LLM1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LqP5;LqP5;)I
    .locals 0

    invoke-virtual {p1}, LqP5;->d()I

    move-result p1

    invoke-virtual {p2}, LqP5;->d()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LqP5;

    check-cast p2, LqP5;

    invoke-virtual {p0, p1, p2}, LLM1$a;->a(LqP5;LqP5;)I

    move-result p1

    return p1
.end method
