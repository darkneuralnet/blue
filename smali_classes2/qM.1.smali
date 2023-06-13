.class public final synthetic LqM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LGM;

.field public final synthetic c:LbE5;


# direct methods
.method public synthetic constructor <init>(LGM;LbE5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqM;->b:LGM;

    iput-object p2, p0, LqM;->c:LbE5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LqM;->b:LGM;

    iget-object v1, p0, LqM;->c:LbE5;

    invoke-static {v0, v1}, LGM;->c0(LGM;LbE5;)V

    return-void
.end method
