.class public final LYX4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXX4;


# instance fields
.field public final a:LZX4;


# direct methods
.method public constructor <init>(LZX4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYX4;->a:LZX4;

    return-void
.end method

.method public static b(LZX4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZX4;",
            ")",
            "LY94<",
            "LXX4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYX4;

    invoke-direct {v0, p0}, LYX4;-><init>(LZX4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)LVX4;
    .locals 1

    iget-object v0, p0, LYX4;->a:LZX4;

    invoke-virtual {v0, p1, p2, p3}, LZX4;->b(Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)LVX4;

    move-result-object p1

    return-object p1
.end method
