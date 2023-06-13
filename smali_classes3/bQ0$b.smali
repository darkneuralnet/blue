.class public final LbQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpn5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LbQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LbQ0$b$a;
    }
.end annotation


# instance fields
.field public final a:LbQ0$b;

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
            "Lcn5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LbQ0$b;->a:LbQ0$b;

    invoke-virtual {p0, p1}, LbQ0$b;->b(LlG2;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LdQ0;)V
    .locals 0

    invoke-direct {p0, p1}, LbQ0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a()Lcn5;
    .locals 1

    iget-object v0, p0, LbQ0$b;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn5;

    return-object v0
.end method

.method public final b(LlG2;)V
    .locals 1

    new-instance v0, LbQ0$b$a;

    invoke-direct {v0, p1}, LbQ0$b$a;-><init>(LlG2;)V

    iput-object v0, p0, LbQ0$b;->b:LY94;

    invoke-static {v0}, Lfn5;->a(LY94;)Lfn5;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LbQ0$b;->c:LY94;

    return-void
.end method
