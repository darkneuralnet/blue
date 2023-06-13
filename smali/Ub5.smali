.class public final synthetic LUb5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LTb5$c;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LTb5$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUb5;->b:LTb5$c;

    iput p2, p0, LUb5;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LUb5;->b:LTb5$c;

    iget v1, p0, LUb5;->c:I

    invoke-static {v0, v1}, LTb5$c;->a(LTb5$c;I)V

    return-void
.end method
