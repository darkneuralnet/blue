.class public final synthetic LZ71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR1$b;


# instance fields
.field public final synthetic a:Le81;


# direct methods
.method public synthetic constructor <init>(Le81;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ71;->a:Le81;

    return-void
.end method


# virtual methods
.method public final onTouchExplorationStateChanged(Z)V
    .locals 1

    iget-object v0, p0, LZ71;->a:Le81;

    invoke-static {v0, p1}, Le81;->x(Le81;Z)V

    return-void
.end method
