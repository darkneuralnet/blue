.class public final LUH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkn0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUH0$a$a;,
        LUH0$a$c;,
        LUH0$a$b;
    }
.end annotation


# instance fields
.field public final a:LUH0$a;

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
            "LGt5;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Len0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn0;LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LUH0$a;->a:LUH0$a;

    invoke-virtual {p0, p1, p2}, LUH0$a;->b(Lhn0;LlG2;)V

    return-void
.end method

.method public synthetic constructor <init>(Lhn0;LlG2;LVH0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LUH0$a;-><init>(Lhn0;LlG2;)V

    return-void
.end method


# virtual methods
.method public a()Len0;
    .locals 1

    iget-object v0, p0, LUH0$a;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Len0;

    return-object v0
.end method

.method public final b(Lhn0;LlG2;)V
    .locals 2

    new-instance v0, LUH0$a$a;

    invoke-direct {v0, p2}, LUH0$a$a;-><init>(LlG2;)V

    iput-object v0, p0, LUH0$a;->b:LY94;

    new-instance v0, LUH0$a$c;

    invoke-direct {v0, p2}, LUH0$a$c;-><init>(LlG2;)V

    iput-object v0, p0, LUH0$a;->c:LY94;

    new-instance v0, LUH0$a$b;

    invoke-direct {v0, p2}, LUH0$a$b;-><init>(LlG2;)V

    iput-object v0, p0, LUH0$a;->d:LY94;

    iget-object p2, p0, LUH0$a;->b:LY94;

    iget-object v1, p0, LUH0$a;->c:LY94;

    invoke-static {p1, p2, v1, v0}, Lin0;->b(Lhn0;LY94;LY94;LY94;)Lin0;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LUH0$a;->e:LY94;

    return-void
.end method
