.class public final LD65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC65;


# instance fields
.field public final a:LE65;


# direct methods
.method public constructor <init>(LE65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD65;->a:LE65;

    return-void
.end method

.method public static a(LE65;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LE65;",
            ")",
            "LY94<",
            "LC65;",
            ">;"
        }
    .end annotation

    new-instance v0, LD65;

    invoke-direct {v0, p0}, LD65;-><init>(LE65;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create()LB65;
    .locals 1

    iget-object v0, p0, LD65;->a:LE65;

    invoke-virtual {v0}, LE65;->b()LB65;

    move-result-object v0

    return-object v0
.end method
