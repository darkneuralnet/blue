.class public LBZ1;
.super LFZ1;
.source "SourceFile"


# static fields
.field public static final H:Ljava/lang/String;


# instance fields
.field public F:LeE5;

.field public G:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, LBZ1;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LBZ1;->H:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LFZ1;-><init>()V

    sget-object v0, LeE5;->c:LeE5;

    iput-object v0, p0, LBZ1;->F:LeE5;

    const-string v0, "#9B9B9B"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LBZ1;->G:I

    sget-object v0, Ls06;->b:Ls06;

    invoke-virtual {p0, v0}, LhZ1;->n0(Ls06;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lbo/app/y1;)V
    .locals 3

    sget-object v0, LeE5;->c:LeE5;

    const-string v1, "slide_from"

    const-class v2, LeE5;

    invoke-static {p1, v1, v2, v0}, LAj2;->l(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, LeE5;

    const-string v1, "close_btn_color"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, p1, p2, v0, v1}, LBZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;LeE5;I)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lbo/app/y1;LeE5;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, LFZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    sget-object p2, LeE5;->c:LeE5;

    iput-object p2, p0, LBZ1;->F:LeE5;

    const-string v0, "#9B9B9B"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LBZ1;->G:I

    iput-object p3, p0, LBZ1;->F:LeE5;

    if-nez p3, :cond_0

    iput-object p2, p0, LBZ1;->F:LeE5;

    :cond_0
    iput p4, p0, LBZ1;->G:I

    sget-object p2, LPE0;->b:LPE0;

    const-string p3, "crop_type"

    const-class p4, LPE0;

    invoke-static {p1, p3, p4, p2}, LAj2;->l(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;

    move-result-object p2

    check-cast p2, LPE0;

    invoke-virtual {p0, p2}, LhZ1;->O(LPE0;)V

    sget-object p2, Ls06;->b:Ls06;

    const-string p3, "text_align_message"

    const-class p4, Ls06;

    invoke-static {p1, p3, p4, p2}, LAj2;->l(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Ls06;

    invoke-virtual {p0, p1}, LhZ1;->n0(Ls06;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LBZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public h0()LzT2;
    .locals 1

    sget-object v0, LzT2;->b:LzT2;

    return-object v0
.end method

.method public v()V
    .locals 3

    invoke-super {p0}, LhZ1;->v()V

    invoke-virtual {p0}, LhZ1;->B()Lbo/app/d3;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LBZ1;->H:Ljava/lang/String;

    const-string v1, "Cannot apply dark theme with a null themes wrapper"

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lbo/app/d3;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, Lbo/app/d3;->b()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, LBZ1;->G:I

    :cond_1
    return-void
.end method

.method public w0()I
    .locals 1

    iget v0, p0, LBZ1;->G:I

    return v0
.end method

.method public x0()LeE5;
    .locals 1

    iget-object v0, p0, LBZ1;->F:LeE5;

    return-object v0
.end method

.method public z()Lorg/json/JSONObject;
    .locals 3

    invoke-virtual {p0}, LhZ1;->C()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LhZ1;->C()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, LFZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    :try_start_0
    const-string v1, "slide_from"

    iget-object v2, p0, LBZ1;->F:LeE5;

    invoke-virtual {v2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "close_btn_color"

    iget v2, p0, LBZ1;->G:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "type"

    invoke-virtual {p0}, LBZ1;->h0()LzT2;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method
