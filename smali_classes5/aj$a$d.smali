.class public Laj$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCk1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laj$a;->a(LMk1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Laj$a;


# direct methods
.method public constructor <init>(Laj$a;)V
    .locals 0

    iput-object p1, p0, Laj$a$d;->a:Laj$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {}, LHg1;->a()V

    :cond_0
    return-void
.end method
