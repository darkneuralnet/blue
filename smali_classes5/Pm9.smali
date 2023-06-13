.class public final synthetic LPm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX94;


# instance fields
.field public final synthetic a:LU96;


# direct methods
.method public synthetic constructor <init>(LU96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPm9;->a:LU96;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LPm9;->a:LU96;

    const-string v1, "json"

    invoke-static {v1}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object v1

    sget-object v2, Lbn9;->a:Lbn9;

    const-string v3, "FIREBASE_ML_SDK"

    const-class v4, [B

    invoke-interface {v0, v3, v4, v1, v2}, LU96;->a(Ljava/lang/String;Ljava/lang/Class;LPc1;LC96;)LR96;

    move-result-object v0

    return-object v0
.end method
