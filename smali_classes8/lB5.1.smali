.class public abstract LlB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT83;


# instance fields
.field public a:LVq5;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, LlB5;->c(LVq5;)V

    return-void
.end method


# virtual methods
.method public c(LVq5;)V
    .locals 0

    iput-object p1, p0, LlB5;->a:LVq5;

    return-void
.end method
