.class public final synthetic LMU0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le13;


# direct methods
.method public synthetic constructor <init>(Le13;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMU0;->b:Le13;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LMU0;->b:Le13;

    invoke-static {v0}, LLU0$o;->d(Le13;)V

    return-void
.end method
