.class public final LE65;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lz65;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lz65;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE65;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LE65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lz65;",
            ">;)",
            "LE65;"
        }
    .end annotation

    new-instance v0, LE65;

    invoke-direct {v0, p0}, LE65;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LY94;)LB65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lz65;",
            ">;)",
            "LB65;"
        }
    .end annotation

    new-instance v0, LB65;

    invoke-direct {v0, p0}, LB65;-><init>(LY94;)V

    return-object v0
.end method


# virtual methods
.method public b()LB65;
    .locals 1

    iget-object v0, p0, LE65;->a:LY94;

    invoke-static {v0}, LE65;->c(LY94;)LB65;

    move-result-object v0

    return-object v0
.end method
