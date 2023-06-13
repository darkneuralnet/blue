.class public final synthetic LQm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX94;


# instance fields
.field public final synthetic a:LAm1;


# direct methods
.method public synthetic constructor <init>(LAm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQm1;->a:LAm1;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQm1;->a:LAm1;

    invoke-static {v0}, Lcom/google/firebase/installations/a;->b(LAm1;)LpW1;

    move-result-object v0

    return-object v0
.end method
