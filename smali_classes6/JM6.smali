.class public final synthetic LJM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LHK6;


# direct methods
.method public constructor <init>(LHK6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJM6;->b:LHK6;

    return-void
.end method

.method public static a(LHK6;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, LJM6;

    invoke-direct {v0, p0}, LJM6;-><init>(LHK6;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LJM6;->b:LHK6;

    invoke-virtual {v0}, LHK6;->F()V

    return-void
.end method
