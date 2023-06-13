.class public final LdL4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcL4;


# instance fields
.field public final a:LeL4;


# direct methods
.method public constructor <init>(LeL4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdL4;->a:LeL4;

    return-void
.end method

.method public static b(LeL4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeL4;",
            ")",
            "LY94<",
            "LcL4;",
            ">;"
        }
    .end annotation

    new-instance v0, LdL4;

    invoke-direct {v0, p0}, LdL4;-><init>(LeL4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/appcompat/app/AppCompatActivity;LGL4;)LbL4;
    .locals 1

    iget-object v0, p0, LdL4;->a:LeL4;

    invoke-virtual {v0, p1, p2}, LeL4;->b(Landroidx/appcompat/app/AppCompatActivity;LGL4;)LbL4;

    move-result-object p1

    return-object p1
.end method
