.class public Lo00$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo00;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo00;


# direct methods
.method public constructor <init>(Lo00;)V
    .locals 0

    iput-object p1, p0, Lo00$a;->a:Lo00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo00$a;->a:Lo00;

    invoke-static {v0}, Lo00;->d(Lo00;)V

    const/4 v0, 0x0

    return-object v0
.end method
