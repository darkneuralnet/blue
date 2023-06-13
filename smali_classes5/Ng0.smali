.class public final synthetic LNg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LvA1;


# instance fields
.field public final synthetic a:LPg0;


# direct methods
.method public synthetic constructor <init>(LPg0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNg0;->a:LPg0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNg0;->a:LPg0;

    check-cast p1, LPg0$a;

    invoke-static {v0, p1}, LPg0;->d(LPg0;LPg0$a;)LPg0$b;

    move-result-object p1

    return-object p1
.end method
