.class public final LOe$b;
.super LHm2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0083\u0004\u0018\u00002\u00020\u0001B8\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nR\u0008\u0012\u0004\u0012\u00028\u00000\r\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ)\u0010\u0008\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tR0\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nR\u0008\u0012\u0004\u0012\u00028\u00000\r8\u0006\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "LOe$b;",
        "LHm2;",
        "LzO2;",
        "LvO2;",
        "measurable",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "f",
        "(LzO2;LvO2;J)LyO2;",
        "LF96$a;",
        "LG52;",
        "Ltf;",
        "LF96;",
        "b",
        "LF96$a;",
        "getSizeAnimation",
        "()LF96$a;",
        "sizeAnimation",
        "LsP5;",
        "LGB5;",
        "c",
        "LsP5;",
        "a",
        "()LsP5;",
        "sizeTransform",
        "<init>",
        "(LOe;LF96$a;LsP5;)V",
        "animation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LF96$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TS;>.a<",
            "LG52;",
            "Ltf;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LGB5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:LOe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOe<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LOe;LF96$a;LsP5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "TS;>.a<",
            "LG52;",
            "Ltf;",
            ">;",
            "LsP5<",
            "+",
            "LGB5;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sizeAnimation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sizeTransform"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LOe$b;->d:LOe;

    invoke-direct {p0}, LHm2;-><init>()V

    iput-object p2, p0, LOe$b;->b:LF96$a;

    iput-object p3, p0, LOe$b;->c:LsP5;

    return-void
.end method


# virtual methods
.method public final a()LsP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LsP5<",
            "LGB5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOe$b;->c:LsP5;

    return-object v0
.end method

.method public f(LzO2;LvO2;J)LyO2;
    .locals 11

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3, p4}, LvO2;->P0(J)LOU3;

    move-result-object p2

    iget-object p3, p0, LOe$b;->b:LF96$a;

    new-instance p4, LOe$b$b;

    iget-object v0, p0, LOe$b;->d:LOe;

    invoke-direct {p4, v0, p0}, LOe$b$b;-><init>(LOe;LOe$b;)V

    new-instance v0, LOe$b$c;

    iget-object v1, p0, LOe$b;->d:LOe;

    invoke-direct {v0, v1}, LOe$b$c;-><init>(LOe;)V

    invoke-virtual {p3, p4, v0}, LF96$a;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LsP5;

    move-result-object p3

    iget-object p4, p0, LOe$b;->d:LOe;

    invoke-virtual {p4, p3}, LOe;->h(LsP5;)V

    iget-object p4, p0, LOe$b;->d:LOe;

    invoke-virtual {p4}, LOe;->f()LK9;

    move-result-object v0

    invoke-virtual {p2}, LOU3;->i1()I

    move-result p4

    invoke-virtual {p2}, LOU3;->d1()I

    move-result v1

    invoke-static {p4, v1}, LH52;->a(II)J

    move-result-wide v1

    invoke-interface {p3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LG52;

    invoke-virtual {p4}, LG52;->j()J

    move-result-wide v3

    sget-object v5, Lpm2;->b:Lpm2;

    invoke-interface/range {v0 .. v5}, LK9;->a(JJLpm2;)J

    move-result-wide v0

    invoke-interface {p3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LG52;

    invoke-virtual {p4}, LG52;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->g(J)I

    move-result v5

    invoke-interface {p3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LG52;

    invoke-virtual {p3}, LG52;->j()J

    move-result-wide p3

    invoke-static {p3, p4}, LG52;->f(J)I

    move-result v6

    const/4 v7, 0x0

    new-instance v8, LOe$b$a;

    invoke-direct {v8, p2, v0, v1}, LOe$b$a;-><init>(LOU3;J)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object p1

    return-object p1
.end method
