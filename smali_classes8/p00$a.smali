.class public Lp00$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp00;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lp00;


# direct methods
.method public constructor <init>(Lp00;)V
    .locals 0

    iput-object p1, p0, Lp00$a;->a:Lp00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp00$a;->a:Lp00;

    invoke-static {v0}, Lp00;->d(Lp00;)V

    const/4 v0, 0x0

    return-object v0
.end method
