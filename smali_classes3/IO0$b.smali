.class public final LIO0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNy4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIO0$b$a;,
        LIO0$b$b;
    }
.end annotation


# instance fields
.field public final a:LIO0$b;

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaG6;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCy4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LGy4;LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LIO0$b;->a:LIO0$b;

    invoke-virtual {p0, p1, p2}, LIO0$b;->b(LGy4;LlG2;)V

    return-void
.end method

.method public synthetic constructor <init>(LGy4;LlG2;LJO0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LIO0$b;-><init>(LGy4;LlG2;)V

    return-void
.end method


# virtual methods
.method public a()LCy4;
    .locals 1

    iget-object v0, p0, LIO0$b;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCy4;

    return-object v0
.end method

.method public final b(LGy4;LlG2;)V
    .locals 1

    new-instance v0, LIO0$b$a;

    invoke-direct {v0, p2}, LIO0$b$a;-><init>(LlG2;)V

    iput-object v0, p0, LIO0$b;->b:LY94;

    new-instance v0, LIO0$b$b;

    invoke-direct {v0, p2}, LIO0$b$b;-><init>(LlG2;)V

    iput-object v0, p0, LIO0$b;->c:LY94;

    iget-object p2, p0, LIO0$b;->b:LY94;

    invoke-static {p1, p2, v0}, LHy4;->a(LGy4;LY94;LY94;)LHy4;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LIO0$b;->d:LY94;

    return-void
.end method
